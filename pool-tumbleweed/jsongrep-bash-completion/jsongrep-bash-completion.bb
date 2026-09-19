SUMMARY = "Bash Completion for jsongrep"
DESCRIPTION = "Bash command line completion support for jsongrep."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "jsongrep-bash-completion-0.9.0-1.4.noarch.rpm"
RPM_HASH = "832340a22d4c042488b3ead2c76153f33d908e4444a65dce13cfdf3e611086ddbc2bd90c80f2ba62ee3f2cefa181f1cecd0d7ef77f139f8c5795f4381f2c57ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsongrep-bash-completion"

RDEPENDS:${PN} += "bash-completion \
jsongrep"

inherit rpm
