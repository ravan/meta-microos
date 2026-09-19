SUMMARY = "Library for importing Microsoft Word documents"
DESCRIPTION = "libwv can parse the Microsoft Word 8 binary file format (Office97)."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "libwv-1_2-4-1.2.9-4.8.aarch64.rpm"
RPM_HASH = "3d7d4ccd8030526d91cc75c2045df797f5107e8926b6c025ede7c8a1e8207cf89e6050b9af1543d354c1dc63be76fd24c9cd821095cf3f624b2718b302c55aba"

RPROVIDES:${PN} += "libwv-1-2-4 \
libwv-1.2.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libxml2.so.16 \
libz.so.1"

inherit rpm
