SUMMARY = "The one true plugin for rbenv bundler integration"
DESCRIPTION = "This plugin makes rbenv 'bundle exec' your ruby executables so you don't have to."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "rbenv-bundle-exec-1.0.0-1.10.noarch.rpm"
RPM_HASH = "254197dca7b9a7402a00c638bba375d8117e44907c6bfe990ad425bfb917b70e4ba368d2bc4bd0475bf59138c96299d9d5c3037254ab540a1a47162f2a2cfbf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbenv-bundle-exec"

RDEPENDS:${PN} += "rbenv"

inherit rpm
