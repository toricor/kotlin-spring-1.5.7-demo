pipeline {
    agent any
    stages {
        stage("echo echo") {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/$branch']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'd585cfdd-fb77-4a02-9f40-60643ab726a1', url: 'https://github.com/toricor/kotlin-spring-1.5.7-demo']]])
                echo "Hello"
            }
        }
    }
}
