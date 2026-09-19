SUMMARY = "Managed C# implementation of D-Bus"
DESCRIPTION = "This is a C# implementation of D-Bus. It's often referred to as \
'managed D-Bus' to avoid confusion with existing bindings (which wrap \
libdbus). \
 \
It is a clean-room implementation based on the D-Bus Specification \
Version 0.11 and study of the wire protocol of existing tools."
LICENSE = "MIT"

PV = "0.6.1a"

RPM_NAME = "ndesk-dbus-0.6.1a-1.13.noarch.rpm"
RPM_HASH = "49d96d86f0504ceeda671359a8a1502fa4beaa6658d610486caff57f88467ea22f0a737feae82336be2d843ba24b3c4e446a76251e636d4039f36d231cc0194e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-NDesk.DBus \
ndesk-dbus \
ndesk-dbus-devel \
pkgconfig-ndesk-dbus-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono-System \
mono-System.Xml \
mono-mscorlib"

inherit rpm
