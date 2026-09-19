SUMMARY = "Bash Completion for xsv"
DESCRIPTION = "Bash completion script for xsv."
LICENSE = "MIT | Unlicense"

PV = "0.13.0"

RPM_NAME = "xsv-bash-completion-0.13.0-2.22.noarch.rpm"
RPM_HASH = "27140f6035c5119a020d538dbbb047eabef7aa06540105ba92400bb53d3c2d6f95aeab00599da894bf6c9e77f8ac7188f7fbae4ad403a24a07bea6302a31ae9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xsv-bash-completion"

RDEPENDS:${PN} += "bash-completion \
xsv"

inherit rpm
