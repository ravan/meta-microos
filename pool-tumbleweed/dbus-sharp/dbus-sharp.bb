SUMMARY = "Managed C# implementation of D-Bus"
DESCRIPTION = "This is DBus-Sharp, a fork of ndesk-dbus or simply a C# implementation \
of D-Bus. \
 \
It is a clean-room implementation based on the D-Bus Specification \
Version 0.11 and study of the wire protocol of existing tools."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "dbus-sharp-0.7.0-19.6.noarch.rpm"
RPM_HASH = "2c59d3d67b730448efb4f6680add5d9a573d3ed40294cc02993d25f1159d4bb73edb628ddaa15c648a35bd763944711c40d67a5b3c0ef7705012b751890fd14e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp \
mono-dbus-sharp"

RDEPENDS:${PN} += "mono-System \
mono-System.Core \
mono-System.Xml \
mono-mscorlib"

inherit rpm
