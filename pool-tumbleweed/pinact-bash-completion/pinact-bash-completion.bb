SUMMARY = "Bash Completion for pinact"
DESCRIPTION = "Bash command line completion support for pinact."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "pinact-bash-completion-4.1.1-1.1.noarch.rpm"
RPM_HASH = "3408643197ba752fd59a02052d5ad56dc3badda51b79bf0d5da654ca99f7a845621a32dc4bce84b9fe1b4640671c26d2022164e97b78b602dd0d6b9531862fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pinact-bash-completion"

RDEPENDS:${PN} += "bash-completion \
pinact"

inherit rpm
