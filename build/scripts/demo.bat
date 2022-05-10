@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  demo startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and DEMO_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\demo.jar;%APP_HOME%\lib\genesis-annotation-jdk5-3.2.jar;%APP_HOME%\lib\genesis-annotation-jdk14-3.2.jar;%APP_HOME%\lib\genesis-aspect-3.2.jar;%APP_HOME%\lib\genesis-aspect-annotated-3.2.jar;%APP_HOME%\lib\genesis-client-3.2.jar;%APP_HOME%\lib\genesis-client-swing-3.2.jar;%APP_HOME%\lib\genesis-client-swt-3.2.jar;%APP_HOME%\lib\genesis-client-thinlet-3.2.jar;%APP_HOME%\lib\genesis-container-3.2.jar;%APP_HOME%\lib\genesis-server-3.2.jar;%APP_HOME%\lib\genesis-shared-3.2.jar;%APP_HOME%\lib\genesis-shared-annotated-3.2.jar;%APP_HOME%\lib\backport175-1.1.RC1-snapshot.jar;%APP_HOME%\lib\commons-beanutils-1.7.jar;%APP_HOME%\lib\commons-digester-1.8.jar;%APP_HOME%\lib\commons-logging-1.1.jar;%APP_HOME%\lib\commons-validator-1.3.1.jar;%APP_HOME%\lib\jakarta-oro-2.0.8.jar;%APP_HOME%\lib\reusable-components-20060810.jar;%APP_HOME%\lib\bsf-2.4.0.jar;%APP_HOME%\lib\bsh-2.0b4.jar;%APP_HOME%\lib\commons-el-1.0.jar;%APP_HOME%\lib\commons-jxpath-1.2.jar;%APP_HOME%\lib\jakarta-taglibs-standard-1.1.2.jar;%APP_HOME%\lib\js-1.6R5.jar;%APP_HOME%\lib\jsp-api.jar;%APP_HOME%\lib\db4o-7.4.106.13438-java5.jar;%APP_HOME%\lib\forms.jar;%APP_HOME%\lib\jcalendar-1.3.3.jar;%APP_HOME%\lib\PgsLookAndFeel.jar;%APP_HOME%\lib\TableLayout-javadoc.jar;%APP_HOME%\lib\TableLayout-src.jar;%APP_HOME%\lib\TableLayout.jar;%APP_HOME%\lib\guava-30.1.1-jre.jar;%APP_HOME%\lib\failureaccess-1.0.1.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\checker-qual-3.8.0.jar;%APP_HOME%\lib\error_prone_annotations-2.5.1.jar;%APP_HOME%\lib\j2objc-annotations-1.3.jar


@rem Execute demo
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %DEMO_OPTS%  -classpath "%CLASSPATH%" org.fpij.jitakyoei.util.Main %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable DEMO_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%DEMO_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
