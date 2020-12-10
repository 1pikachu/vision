node('master')
{
	stage('build env'){
		sh '''
			# source pythonenv
			echo "prepare pythonenv"
			python --version
			# build proj
			echo "build start"
			# check proj whether build
			echo "the proj build success"
		'''
	}
	stage('run test'){
		sh '''
			# begin test
			echo "test start"
			# get test exit code
			echo "test exit code is: "$?
		'''
	}
	stage('collect log'){
		sh '''
			# collect log
			echo "collect log fininshed"
		'''
	}
}
