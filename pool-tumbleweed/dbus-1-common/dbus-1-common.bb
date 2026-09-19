SUMMARY = "D-BUS message bus configuration"
DESCRIPTION = "D-Bus is a message bus system, The dbus-common package provides the configuration and setup files for D-Bus \
implementations to provide a System and User Message Bus."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "1.14.10"

RPM_NAME = "dbus-1-common-1.14.10-5.5.noarch.rpm"
RPM_HASH = "fe60b4e460aa2e384a703c67ac9e7f575727d02ffab25a6e743885f1fe119c3fc5c1bb07ee292bd4204a35d2333036fed912918287a56c4e35388b1f5d773961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dbus-1-common \
dbus-1-common \
group-messagebus \
user-messagebus"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
