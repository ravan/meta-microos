SUMMARY = "Bash Completion for stackit-cli"
DESCRIPTION = "Bash command line completion support for stackit-cli."
LICENSE = "Apache-2.0"

PV = "0.72.0"

RPM_NAME = "stackit-cli-bash-completion-0.72.0-1.1.noarch.rpm"
RPM_HASH = "2434eef5e7e07c2522734543c1483b0a08b933258aa4769616d41e5067d1a778a976382d50c25950dd1875564b7776db4711099b3267fd469af9d3997079f7c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stackit-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
stackit-cli"

inherit rpm
