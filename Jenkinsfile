pipeline {
    
    agent any
    stages {
        stage("hello") {
            steps {
                git credentialsId: 'd585cfdd-fb77-4a02-9f40-60643ab726a1', url: 'https://github.com/toricor/kotlin-spring-1.5.7-demo'
                echo "hello multibranch world"
            }
        }
    }
}
