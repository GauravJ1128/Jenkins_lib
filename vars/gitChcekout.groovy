
def call(map stageParams) {

    chcekout{[
        $class:     'GitSCM'
        branch:   [[name: stageParams.branch]],
        userRemoteCinfig:   [[url:  stageParams.url]]
    ]}
}