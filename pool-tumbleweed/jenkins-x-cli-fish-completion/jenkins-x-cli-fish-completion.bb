SUMMARY = "Fish Completion for jenkins-x-cli"
DESCRIPTION = "Fish command line completion support for jenkins-x-cli."
LICENSE = "Apache-2.0"

PV = "3.17.74"

RPM_NAME = "jenkins-x-cli-fish-completion-3.17.74-1.1.noarch.rpm"
RPM_HASH = "0f0616af76dad1ecd6567a82a9f7fb6dd0bf8651bef52ad7cd2897ae6f8c531fb9015474b8161d5b844c0c0a2ad1cbddc0369d00668205d7f568ea993e7c1a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jenkins-x-cli-fish-completion"

RDEPENDS:${PN} += "jenkins-x-cli"

inherit rpm
