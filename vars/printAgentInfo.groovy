def call() {
    sh '''
        echo "==========================="
        echo "    AGENT INFORMATION"
        echo "==========================="
        echo "Current user: $(whoami)"
        echo "Hostname: $(hostname)"
        echo "Workspace: ${PWD}"
        echo "==========================="
    '''
}