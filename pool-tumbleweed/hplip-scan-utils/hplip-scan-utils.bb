SUMMARY = "HPLIP scanning frontends hp-scan and hp-uiscan"
DESCRIPTION = "This package provides the 'hp-scan' and 'hp-uiscan' frontend utilities. These \
utilities are alternatives to the SANE frontends 'xsane' and 'scanimage'. They \
expose some advanced features of certain HP scanner models."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-scan-utils-3.26.4-2.2.aarch64.rpm"
RPM_HASH = "77aba65568f0e45c28e117adfda3685377ea20ead9558f7d9b8da917cc8f49c3b7e80c54c8aa54ad2bbc14ac25b39f5be9d8a3747ed9a1950a356e30ccba04fa"

RPROVIDES:${PN} += "hplip-scan \
hplip-scan-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
hplip \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
python-abi \
python3-Pillow \
python3-scikit-image"

inherit rpm
