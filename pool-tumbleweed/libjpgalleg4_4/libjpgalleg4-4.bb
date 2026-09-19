SUMMARY = "JPEG support library for Allegro"
DESCRIPTION = "This library allows to load/save JPG images using standard Allegro image \
handling functions."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "libjpgalleg4_4-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "9ae99a7caca7ae5d954251ce88bb8920d75b8cbf25747c4345dba19a0182d0ca17ca6b4b4accfbe0e03bf2e9441c856d376b35038de08b956c36df3834f4d371"

RPROVIDES:${PN} += "libjpgalleg.so.4.4 \
libjpgalleg4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libm.so.6"

inherit rpm
