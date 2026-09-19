SUMMARY = "PNG support library for Allegro"
DESCRIPTION = "This library allows to load/save PNG images using standard Allegro image \
handling functions."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libloadpng4_4-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "6fcc280838c3b94e0fa9b91004809bfdda8e4eb7d2763bcc6cadfba03f2544d8dcf16afa59af6b55cb4b3efe91868b21628746d0c4a4693fc6807786636c9449"

RPROVIDES:${PN} += "libloadpng.so.4.4 \
libloadpng4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libpng16.so.16"

inherit rpm
