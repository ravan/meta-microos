SUMMARY = "Managed C# implementation of D-Bus"
DESCRIPTION = "This is DBus-Sharp, a fork of ndesk-dbus or simply a C# implementation \
of D-Bus. \
 \
It is a clean-room implementation based on the D-Bus Specification \
Version 0.11 and study of the wire protocol of existing tools."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "dbus-sharp2-0.8.1-4.7.noarch.rpm"
RPM_HASH = "61e9839f70ad47b947e07efc3b36b854c545c57ff99901ba0278ecf892934857566c02e81cc74b63613263df97361339d6a5d9304f3806b8e58401a700a6e6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp2 \
mono-dbus-sharp"

RDEPENDS:${PN} += "mono-Mono.Posix \
mono-System \
mono-System.Core \
mono-System.Xml \
mono-mscorlib"

inherit rpm
