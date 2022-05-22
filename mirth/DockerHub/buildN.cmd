@echo off

rem pousser l'image vers le dockerhub
set DOMAINE=%1
set PASSWORD=%2

set NOMAPPLI=mirth311

IF "%PASSWORD%"=="" goto NOPASSWORD
IF "%DOMAINE%"=="" goto NOPASSWORD


echo Construct %NOMAPPLI% and push to %DOMAINE% using password %PASSWORD%
echo

docker login -u %DOMAINE% -p %PASSWORD%
docker build -t %NOMAPPLI% .
docker tag %NOMAPPLI% %DOMAINE%/%NOMAPPLI%
docker push %DOMAINE%/%NOMAPPLI%:latest
goto SUPP

:NOPASSWORD
cls
echo syntaxe buildN.cmd domaineDH passwordDH
echo exemple : buildN.cmd mondocker monpassword
goto FIN

:SUPP
rem supprimer les fichiers sources

:FIN
