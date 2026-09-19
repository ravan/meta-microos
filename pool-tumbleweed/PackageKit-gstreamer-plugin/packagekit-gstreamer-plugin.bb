SUMMARY = "Install GStreamer codecs using PackageKit"
DESCRIPTION = "The PackageKit GStreamer plugin allows any Gstreamer application to install \
codecs from configured repositories using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.6"

RPM_NAME = "PackageKit-gstreamer-plugin-1.3.6-2.1.aarch64.rpm"
RPM_HASH = "cd4b33e7fcf9fb23f775ab20de78856ea6c72b2d30457dc0b34e405dbe396abd78f60f381f7f0ba5e6b8df24e99bcd9eca20b2c73878cfcf49057b41410b10e8"

RPROVIDES:${PN} += "PackageKit-gstreamer-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpackagekit-glib2.so.18"

inherit rpm
