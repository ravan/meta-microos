SUMMARY = "Bash Completion for copacetic"
DESCRIPTION = "Bash command line completion support for copacetic."
LICENSE = "Apache-2.0"

PV = "0.14.2"

RPM_NAME = "copacetic-bash-completion-0.14.2-1.2.noarch.rpm"
RPM_HASH = "e0744bde7368f9f5374306b934886c447e7bc82f7a96a5d23266aaacd25d016abe1d8f0968a471d79113d9caf5962b9f319eb2b7c4b0f5c983d58a7d4df0d64a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "copacetic-bash-completion"

RDEPENDS:${PN} += "bash-completion \
copacetic"

inherit rpm
