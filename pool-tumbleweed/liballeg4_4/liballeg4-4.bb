SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeg4_4-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "19c49be0ce50053b5cc10757b41550d9c55b416f46882333ec258cb5260f2eda3f77fee24f80008ef6de018d8df5b7e5f0e3c548efe9825e6964e66a0c2fc819"

RPROVIDES:${PN} += "liballeg.so.4.4 \
liballeg4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXpm.so.4 \
libXxf86vm.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
