SUMMARY = "Jack plugin for xine"
DESCRIPTION = "xine sound output plugin for the jack soundserver \
 \
 \
 \
Authors: \
-------- \
    Guenter Bartsch <guenter@users.sourceforge.net>"
LICENSE = "GPL-2.0-or-later & SUSE-Public-Domain"

PV = "1.2.13"

RPM_NAME = "libxine2-jack-1.2.13-11.5.aarch64.rpm"
RPM_HASH = "f8c928ee9487291f367b712dffb2b48466d24aaadc8ab945d2c926c9405a75b4f1dcd91dc98ed0096e467b57a998697bcfae8408cfe90a016d04022ceeca526b"

RPROVIDES:${PN} += "libxine2-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0 \
libxine.so.2 \
libxine2"

inherit rpm
