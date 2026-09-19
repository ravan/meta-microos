SUMMARY = "GNU Aspell - Pspell Compatibility Library"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains the pspell compatibility library."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8.2"

RPM_NAME = "libpspell15-0.60.8.2-1.3.aarch64.rpm"
RPM_HASH = "5035a0eafd443b4e5ac23e8371aadf2427b3113690fa2f68dd402475ca75ece0daf2f5fdd5621f0f191e86320210ddd29427b1f402f61aa224ba2d105707eac0"

RPROVIDES:${PN} += "libpspell.so.15 \
libpspell15"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
