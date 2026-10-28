
def call() {
    def configText = libraryResource('config.json')
    def config = new groovy.json.JsonSlurperClassic().parseText(configText)

    printMessage(config.message, config.times as int)
}
