pipeline{
    agent{
        stages{
            stage("test"){
                steps {
                    echo " To Test the envirnoment"
                }
            }
            stage("build"){
                steps {
                    echo " To buidl the envirnoment"
                }
            }
            stage("deploy"){
                steps {
                    echo " To deploy the envirnoment"
                }
            }

        }
    }
}