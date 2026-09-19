SUMMARY = "Bash Completion for jfrog-cli"
DESCRIPTION = "Bash command line completion support for jfrog-cli."
LICENSE = "Apache-2.0"

PV = "2.122.0"

RPM_NAME = "jfrog-cli-bash-completion-2.122.0-1.1.noarch.rpm"
RPM_HASH = "6e64f100f89f0b18f5b892649876b420df844ba63c83fe096937f4c8963dc40994d216601f64d9db704577958cd92c1c92a6989ffae473d9109009737a6013db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jfrog-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
jfrog-cli"

inherit rpm
