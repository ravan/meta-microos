SUMMARY = "System user and group greeter"
DESCRIPTION = "The greeter system user and group, used by login managers such as greetd"
LICENSE = "MIT"

PV = "1"

RPM_NAME = "system-user-greeter-1-3.6.noarch.rpm"
RPM_HASH = "0ed6980e637a31b9e1cfde1d38fb83bcf47a64bd5e793b80f296ec55e4e2001df547732dd5a4a6ae7566dcca9756c05ffee673f4db021e8e0ca27087b6d6dcff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-greeter \
system-user-greeter \
user-greeter"

RDEPENDS:${PN} += "/usr/bin/sh \
group-video \
sysuser-shadow"

inherit rpm
