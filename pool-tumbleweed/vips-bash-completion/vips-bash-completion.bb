SUMMARY = "Bash Completion for vips"
DESCRIPTION = "Bash command line completion support for vips."
LICENSE = "LGPL-2.1-only"

PV = "8.18.5"

RPM_NAME = "vips-bash-completion-8.18.5-1.3.noarch.rpm"
RPM_HASH = "5ca50b42ff7a266f70ca6114dc4b64c2d8673cab3f2c52f22a3fdb46cb936efaeea5ce4c364fa7d7081466749ced4f2345160cf9cd8e24eacafc2d90ad01dfaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vips-bash-completion"

RDEPENDS:${PN} += "bash-completion \
vips-tools"

inherit rpm
