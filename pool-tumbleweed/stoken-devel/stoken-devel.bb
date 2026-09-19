SUMMARY = "Development files for stoken"
DESCRIPTION = "Software Token for Linux/UNIX. It's a token code generator compatible with RSA \
SecurID 128-bit (AES) tokens. It is a hobbyist project, not affiliated with or \
endorsed by RSA Security. \
 \
This package provides the development files for stoken."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "0.93"

RPM_NAME = "stoken-devel-0.93-1.12.aarch64.rpm"
RPM_HASH = "14b79606531fd45b0a031a1b36da02fbfadd3ff4f71dafe620d889b1293bb72fdf3ebe26b06f2ebd8e2df74193ec4573c81351490ab7a4b3b99b18b47cadd05a"

RPROVIDES:${PN} += "pkgconfig-stoken \
stoken-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstoken1 \
pkgconfig-libtomcrypt \
pkgconfig-libxml-2.0"

inherit rpm
