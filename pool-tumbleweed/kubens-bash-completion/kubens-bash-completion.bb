SUMMARY = "Bash Completion for kubens"
DESCRIPTION = "Bash command line completion support for kubens."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "kubens-bash-completion-0.11.0-2.3.noarch.rpm"
RPM_HASH = "80c479661f2cef3f8d3bf4b814e67d62ac55340629cdca928e5516ea958334e2ed91465c283204a12cdf29c47b6be04e135d5f1169e9b36cd5a9ff271bcce228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubens-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubens"

inherit rpm
