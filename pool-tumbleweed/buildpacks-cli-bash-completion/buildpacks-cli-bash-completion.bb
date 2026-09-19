SUMMARY = "Bash Completion for buildpacks-cli"
DESCRIPTION = "Bash command line completion support for buildpacks-cli."
LICENSE = "Apache-2.0"

PV = "0.40.9"

RPM_NAME = "buildpacks-cli-bash-completion-0.40.9-1.1.noarch.rpm"
RPM_HASH = "35b888b9fa14e796a481c555922bdd93c4a722e007c12656ede65f22d72890b91389ead279c6b305122a8d73ecebf2118f617599b7772da80cc3c8eda42a9f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "buildpacks-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
buildpacks-cli"

inherit rpm
