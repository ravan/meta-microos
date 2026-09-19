SUMMARY = "Developer documentation package for D-Bus"
DESCRIPTION = "D-Bus is a message bus system, a simple way for applications to talk to \
one another. D-BUS supplies both a system daemon and a \
per-user-login-session daemon. Also, the message bus is built on top of \
a general one-to-one message passing framework, which can be used by \
any two apps to communicate directly (without going through the message \
bus daemon)."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.10"

RPM_NAME = "dbus-1-devel-doc-1.14.10-5.5.noarch.rpm"
RPM_HASH = "41c6e7fd28335399a0e36fb607fdcfd3295884c9c82d514e5d9874a3c0b57832273e64c895960471cdac90275f249963ddc65209aa3f21ebd7595fcddf8dabaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-1-devel-doc"

RDEPENDS:${PN} += "dbus-1"

inherit rpm
