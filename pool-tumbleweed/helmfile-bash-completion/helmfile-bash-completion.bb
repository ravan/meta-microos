SUMMARY = "Bash Completion for helmfile"
DESCRIPTION = "Bash command line completion support for helmfile."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "helmfile-bash-completion-1.8.0-1.1.noarch.rpm"
RPM_HASH = "197319dae92fecb0bcc16a13a35e1bc473bc6f728927e3bf20b466f5aee7195d6eae46a06f93ca845c2c33002a0113d15892650f0546e15d016d8a769890ff28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helmfile-bash-completion"

RDEPENDS:${PN} += "helmfile"

inherit rpm
