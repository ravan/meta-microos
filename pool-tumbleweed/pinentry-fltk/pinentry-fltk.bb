SUMMARY = "Collection of Simple PIN or Passphrase Entry Dialogs"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using FLTK libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "pinentry-fltk-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "66957e19d324d15cecb23de849d799335e508b69a4f921a6a2343db1714c5d02dade18461d1961db548bececd2b9ccc7440f26b74686cf7efb2d1870eb413496"

RPROVIDES:${PN} += "pinentry-/usr/bin/pinentry-fltk \
pinentry-dialog \
pinentry-fltk \
pinentry-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgpg-error.so.0 \
libncursesw.so.6 \
libsecret-1.so.0 \
libstdc++.so.6 \
libtinfo.so.6 \
pinentry"

inherit rpm
