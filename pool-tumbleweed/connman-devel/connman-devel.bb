SUMMARY = "Development files for Connection Manager"
DESCRIPTION = "connman-devel contains development files for use with connman."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-devel-1.42-2.16.aarch64.rpm"
RPM_HASH = "167710001917bb7ca0a42e548f5a1b06bfbe0116248631c7b474fcbf1e6871a6b4c7dfae97f24e6db865a7b888f4b3d44f93efea616f9d848ffb5b7ec186d3ce"

RPROVIDES:${PN} += "connman-devel \
pkgconfig-connman"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
connman \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0"

inherit rpm
