SUMMARY = "Managed C# implementation of D-Bus"
DESCRIPTION = "This is DBus-Sharp, a fork of ndesk-dbus or simply a C# implementation \
of D-Bus. \
 \
It is a clean-room implementation based on the D-Bus Specification \
Version 0.11 and study of the wire protocol of existing tools."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "dbus-sharp-devel-0.7.0-19.6.noarch.rpm"
RPM_HASH = "f06231d992b53f80fb4e15468a814cc1d23e6c394158aa4e50729e582f37dc78bc2fb64051e25f7136b2b57d28e7d6f9ccb09e89db43ae07b8dfa52717c48e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp-devel \
pkgconfig-dbus-sharp-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-sharp"

inherit rpm
