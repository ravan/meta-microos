SUMMARY = "Bash completion for ugrep"
DESCRIPTION = " \
This package contains the bash completion for ugrep."
LICENSE = "BSD-3-Clause"

PV = "7.8.4"

RPM_NAME = "ugrep-bash-completion-7.8.4-1.1.noarch.rpm"
RPM_HASH = "831d8eaa8cf1b647017c85d0995f554b64fe6bd9e10cb4dafc057938864b5b4f60fe60822a62e5d8a21dbc6c2604fd61bb2602414e6e650a1841f15437cc774a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ugrep-bash-completion"

RDEPENDS:${PN} += "bash-completion \
ugrep"

inherit rpm
