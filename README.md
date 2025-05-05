# Jenkins Shared Library: printAgentInfo

## Description
This shared library provides a reusable function to print agent information, including:
- Current user (`whoami`)
- Hostname (`hostname`)
- Workspace (`${env.WORKSPACE}`)

## Usage
To use this function in your Jenkins pipeline, include the library and call the function

```groovy
@Library('jenkins-shared-library') _ 
printAgentInfo()



---

### **5. Subir los cambios al repositorio**

#### *Paso 5.1: Inicializar el repositorio*
Si el repositorio no está inicializado, ejecuta los siguientes comandos:
 
```bash
git init
git add .
git commit -m "Initial commit: Add printAgentInfo function"
git branch -M main
git remote add origin <URL_DEL_REPOSITORIO>
git push -u origin main

