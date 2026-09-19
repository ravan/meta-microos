SUMMARY = "Mozc - Japanese Input Method for Chromium OS, Mac and Linux"
DESCRIPTION = "Mozc is a Japanese Input Method Editor (IME) designed for \
multi-platform such as Chromium OS, Mac and Linux. This open-source \
project originates from Google Japanese Input."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain & Zlib"

PV = "3.33.6133.102"

RPM_NAME = "mozc-3.33.6133.102-2.2.aarch64.rpm"
RPM_HASH = "f34b0e87bb301fdc7d23242ae68c4135d1574558646b771aa4dcb66c47caf25b03891e4149a0b27614a72cfa857e052d1f31521e2e07d63ba6e1cd1cda5b180b"

RPROVIDES:${PN} += "mozc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
