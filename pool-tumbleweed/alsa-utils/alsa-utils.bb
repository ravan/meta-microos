SUMMARY = "Advanced Linux Sound Architecture Utilities"
DESCRIPTION = "This package contains utility programs supporting ALSA, Advanced Linux \
Sound Architecture."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.16"

RPM_NAME = "alsa-utils-1.2.16-1.3.aarch64.rpm"
RPM_HASH = "013fa8f74736d8afb2cd2ddfc2c868d6de703a897d0733c75ada34c048c29815b94a2f10300618904fce3b1fb6ea4dbadb8772e8ff6354868957a6cf970031e0"

RPROVIDES:${PN} += "alsa-utils \
libalsatplg-module-nhlt.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
alsa \
dialog \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libatopology.so.2 \
libc.so.6 \
libformw.so.6 \
libm.so.6 \
libmenuw.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libsamplerate.so.0 \
libtinfo.so.6 \
pciutils \
tree"

inherit rpm
