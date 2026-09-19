SUMMARY = "Utilities for Displaying and Converting Metafile Images"
DESCRIPTION = "These utilities read metafile images and can either display them \
using the X Window System or convert them to standard formats such as \
PNG, JPEG, PS, EPS, and more."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.15"

RPM_NAME = "libwmf-tools-0.2.15-1.3.aarch64.rpm"
RPM_HASH = "e931b90f3e0f5d6b0e2ca6a1d78e15eaf4f521119cdad73b67d5df3b431a23a897050a09885ccd4ae333e3b7c226da800d408f2b51a53e27ba9d7b9dd2d4af23"

RPROVIDES:${PN} += "libwmf \
libwmf-tools \
wmf-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7 \
libz.so.1"

inherit rpm
