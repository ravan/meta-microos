SUMMARY = "Second phase firmware loader for Tascam USX2Y USB soundcards"
DESCRIPTION = "Usx2yloader is a helper program to load the 2nd Phase firmware binaries \
onto the Tascam USX2Y USB soundcards."
LICENSE = "GPL-2.0-or-later"

PV = "0.3"

RPM_NAME = "usx2yloader-0.3-29.4.aarch64.rpm"
RPM_HASH = "5d95b82aaa13c49fdb9c4dc742994e0267583a267e48f61da5b3e6fe2b0c9eaede0831a2f52ddf1eca462cefd8a20d92051aea7e5e9b63f6b934434b235f5dc9"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/usx2yloader \
usx2yloader"

RDEPENDS:${PN} += "alsa-firmware \
fxload \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
