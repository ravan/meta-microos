SUMMARY = "Character Set Converter"
DESCRIPTION = "Recode converts files between various character sets. \
It supports conversion to and from HTML entities as well."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.7.15"

RPM_NAME = "recode-3.7.15-2.5.aarch64.rpm"
RPM_HASH = "c9e9dc5c1e38b563380ddb4c75ab5dff77424ce99c636fa1127ad3db83208591d16d091ac9ad65aa25c7b09410f2bae4ad7db33f52116267f372b1d9556cd3c8"

RPROVIDES:${PN} += "recode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librecode.so.3"

inherit rpm
