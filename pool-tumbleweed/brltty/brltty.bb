SUMMARY = "Braille display driver for Linux/Unix"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality."
LICENSE = "LGPL-2.1-or-later"

PV = "6.9.1"

RPM_NAME = "brltty-6.9.1-2.1.aarch64.rpm"
RPM_HASH = "eeb2e31bc053acc91083aed46c2d8a86851174b2b02082f240d61f16a9af61fe2f4e4a510e7841ac246ea92bcd5be7f5c312a1998896ff10cb239efa027c5932"

RPROVIDES:${PN} += "brltty \
config-brltty \
libbrlttybal.so \
libbrlttybat.so \
libbrlttybbc.so \
libbrlttybbd.so \
libbrlttybbg.so \
libbrlttybbl.so \
libbrlttybbm.so \
libbrlttybbn.so \
libbrlttybcb.so \
libbrlttybce.so \
libbrlttybcn.so \
libbrlttybdp.so \
libbrlttybec.so \
libbrlttybeu.so \
libbrlttybfa.so \
libbrlttybfs.so \
libbrlttybhd.so \
libbrlttybhm.so \
libbrlttybht.so \
libbrlttybhw.so \
libbrlttybic.so \
libbrlttybir.so \
libbrlttyblt.so \
libbrlttybmb.so \
libbrlttybmd.so \
libbrlttybmm.so \
libbrlttybmn.so \
libbrlttybmt.so \
libbrlttybnp.so \
libbrlttybpg.so \
libbrlttybpm.so \
libbrlttybsk.so \
libbrlttybtn.so \
libbrlttybts.so \
libbrlttybtt.so \
libbrlttybvd.so \
libbrlttybvo.so \
libbrlttybvs.so \
libbrlttysal.so \
libbrlttysbl.so \
libbrlttyscb.so \
libbrlttysen.so \
libbrlttysfv.so \
libbrlttysgs.so \
libbrlttysxs.so \
libbrlttyxem.so \
libbrlttyxfv.so \
libbrlttyxlx.so \
libbrlttyxsc.so \
libbrlttyxtx.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libbluetooth.so.3 \
libbrlapi.so.0.8 \
libc.so.6 \
libdbus-1.so.3 \
libespeak-ng.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpm.so.2 \
libicuuc.so.78 \
libncursesw.so.6 \
libpcre2-32.so.0 \
libpolkit-gobject-1.so.0 \
libsystemd.so.0 \
libtinfo.so.6 \
libudev.so.1 \
system-user-brltty"

inherit rpm
