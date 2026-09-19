SUMMARY = "Collection of Simple PIN or Passphrase Entry Dialogs"
DESCRIPTION = "This is a collection of simple PIN or passphrase entry dialogs which \
utilize the Assuan protocol as described by the Aegypten project."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "pinentry-1.3.3-1.2.aarch64.rpm"
RPM_HASH = "b92ed6a70028ce383632c2af58fcfea82d220d4897115ca1afcae35a1b83f8a8f0220331e840c78570aeccb571437101326596792f09f055ec4c7bf63a765f2f"

RPROVIDES:${PN} += "pinentry \
pinentry-dialog"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libgpg-error.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
