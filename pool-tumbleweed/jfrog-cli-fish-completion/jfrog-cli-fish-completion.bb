SUMMARY = "Fish Completion for jfrog-cli"
DESCRIPTION = "Fish command line completion support for jfrog-cli."
LICENSE = "Apache-2.0"

PV = "2.122.0"

RPM_NAME = "jfrog-cli-fish-completion-2.122.0-1.1.noarch.rpm"
RPM_HASH = "6e420613f38976d74e7f83f615cd3c089bc7b35bbb3244bd247dfb1534bd0f46d0d69e787f76582a87d19b6598698091be0568540f8d41030e02f841ce777e40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfrog-cli-fish-completion"

RDEPENDS:${PN} += "fish \
jfrog-cli"

inherit rpm
