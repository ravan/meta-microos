SUMMARY = "Bash Completion for kubepug"
DESCRIPTION = "Bash command line completion support for kubepug."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "kubepug-bash-completion-1.7.1-2.12.noarch.rpm"
RPM_HASH = "6877754560273d60fa67eac14dbabdff33059b6f27bc22d38baf8342fc6952520905893fb958b4b44b26c92c7ffad2c4b590437e59b67bfea4f2737f7d2a4c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubepug-bash-completion"

RDEPENDS:${PN} += "bash-completion \
kubepug"

inherit rpm
