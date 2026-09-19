SUMMARY = "PCM I/O Plug-In for ALSA Library to access USB USx2y audio"
DESCRIPTION = "This package contains a PCM I/O plugin to access USB USx2y audio devices \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-usb-stream-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "cdc626afae250442f7f6f72d4cab63c43e981d96dd665769d1e08cb2441774f413781554fda726a346dbbd58943cae6d49a0e08052c3eb1cad33edcd7ac05df6"

RPROVIDES:${PN} += "alsa-plugins-usb-stream \
libasound-module-pcm-usb-stream.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
