
def call(Map stageParams) {

    chcekout{[
        $class:     'GitSCM'
        branches:   [[ name: stageParams.branch ]],
        userRemoteCinfig:   [[url:  stageParams.url]]
    ]}
}