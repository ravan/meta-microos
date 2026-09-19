SUMMARY = "System user and group nagios"
DESCRIPTION = "This package provides the user and group 'nagios' for various applications."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "system-user-nagios-1.0.0-1.8.noarch.rpm"
RPM_HASH = "0baea6656d988c93434382c3a0942452e134169e77736eaf6919745579593fa4b5bb4cbd56cdeb7946dd3db96093f5692666e5a71867621aae772331710f86a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-nagcmd \
group-nagios \
system-user-nagios \
user-nagios"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
