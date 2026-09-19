SUMMARY = "Bash Completion for operator-sdk"
DESCRIPTION = "Bash command line completion support for operator-sdk."
LICENSE = "Apache-2.0"

PV = "1.42.3"

RPM_NAME = "operator-sdk-bash-completion-1.42.3-1.3.noarch.rpm"
RPM_HASH = "99758ac8f17bf343ffab6595ae719d4b7d67e9fd50185d48467e9dbc69e43e025806339b2af3db5dc18be9c420ced255a811f306d569af387399871db159fbdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "operator-sdk-bash-completion"

RDEPENDS:${PN} += "bash-completion \
operator-sdk"

inherit rpm
