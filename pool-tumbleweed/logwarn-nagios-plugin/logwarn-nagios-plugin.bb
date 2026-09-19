SUMMARY = "Nagios plugin based on the logwarn(1) utility"
DESCRIPTION = "logwarn searches for interesting messages in log files, where ``interest- \
ing'' is defined by an user-supplied list of positive and negative (pre- \
ceeded with a ``!'') extended regular expressions provided on the command \
line. \
 \
This package contains the Nagios plugin that is based on logwarn."
LICENSE = "Apache-2.0"

PV = "1.0.17"

RPM_NAME = "logwarn-nagios-plugin-1.0.17-1.13.noarch.rpm"
RPM_HASH = "c83760e823e779d0a3dc36b699d28385864bb1d6b7e78c8279e5e7b80d2b69298c0c7459f7a81d84ae09fe3f60b56223206d07b481fc18476e5b6e0f0cdcaeda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logwarn-nagios-plugin"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
logwarn"

inherit rpm
