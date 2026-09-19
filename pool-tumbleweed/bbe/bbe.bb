SUMMARY = "Binary Block Editor"
DESCRIPTION = "bbe is a sed-like editor for binary files. Instead of reading input in \
lines as sed, bbe reads arbitrary blocks from an input stream and performs \
byte-related transformations on found blocks."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "bbe-0.2.2-3.24.aarch64.rpm"
RPM_HASH = "5963d63e137f88d7119f0f240a3b74068931531d5c1c48d269e53d85ae5305242c8fe3c44531add880a88691f9231a6eae4d1c89d1086863a1d9b488c46042e8"

RPROVIDES:${PN} += "bbe"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
