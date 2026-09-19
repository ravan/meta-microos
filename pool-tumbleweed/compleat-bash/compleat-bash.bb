SUMMARY = "Files to use compleat in the bash shell"
DESCRIPTION = " \
Contains a script that is automatically loaded by the bash shell on startup to \
setup the automatic completion by compleat."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-bash-1.0+git.20220402.ec8fccc-1.25.noarch.rpm"
RPM_HASH = "3eea56bdbd00aae6c402db3b1917c02135af51c946a8e67c59e178b16a429836698dbc079945d472e51c49ba4d0d708ce1b7372fd12050356e1ca04d380b6685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compleat-bash \
config-compleat-bash"

RDEPENDS:${PN} += "compleat"

inherit rpm
