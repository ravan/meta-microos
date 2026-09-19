SUMMARY = "Tools for Near Field Communication"
DESCRIPTION = "libnfc is a low-level SDK for various RFID and NFC applications. \
 \
It supports various NFC hardware devices: dongles, flat and OEM \
devices. The library currently supports modulations for ISO/IEC 14443 \
(A and B), FeliCa, Jewel tags and Data Exchange Protocol (P2P) as \
target and as initiator. \
 \
This package contains the NFC utilities."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libnfc-tools-1.8.0-2.6.aarch64.rpm"
RPM_HASH = "310896f508655147ab2134de5ad917d13984154888f5544186b9f4b33a03d10a2d035138eba27a153e73eeff31d1868d79506a6bf6977c0d0d14e63491e0e76b"

RPROVIDES:${PN} += "libnfc-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfc.so.6 \
libreadline.so.8"

inherit rpm
