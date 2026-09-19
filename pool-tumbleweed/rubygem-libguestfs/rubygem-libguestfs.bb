SUMMARY = "Ruby bindings for libguestfs"
DESCRIPTION = "ruby-libguestfs contains Ruby bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "rubygem-libguestfs-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "408b94c763643eda52178d7788c72d8e9c1bd22bb33f01004c81278a68ad810f7bd87be1d52f1c2f99097deede09119df58b2b1d85579a5d69fcc7b40dd65004"

RPROVIDES:${PN} += "rubygem-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
libm.so.6 \
libruby4.0.so.4.0 \
ruby"

inherit rpm
