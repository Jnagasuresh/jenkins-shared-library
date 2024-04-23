import com.nagsacademy.builds.Calculator
Calculator calculator = new Calculator(this)
pipeline {
    agent any
    stages {
        stage ('AdditionStage') {
            steps {
                script {
                     echo "Printing sum of 2 numbers"
                println calculator.add(10,20)
                }
            }
        }
        stage ('Mailing'){
            steps {
                echo "Sending a mail ..............."
            }
        }
    }
}