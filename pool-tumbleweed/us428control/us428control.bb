SUMMARY = "Sound Blaster 16 ASP/CSP control program"
DESCRIPTION = "This package contains a control tool for Tascam US-X2Y audio devices"
LICENSE = "GPL-2.0-or-later"

PV = "0.4.6"

RPM_NAME = "us428control-0.4.6-29.4.aarch64.rpm"
RPM_HASH = "fbc05339254e7e8be5c5b2deffae8048c68f4d0d352b995b9d6eaafe2615e60064d6d8ee0c4c157157d4fc2882b8f05f329f5986ff1a8e013d2eb1f2ad9cc1b6"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/us428control \
us428control"

RDEPENDS:${PN} += "alsa-firmware \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
