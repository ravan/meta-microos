SUMMARY = "LV2 plugins for librubberband"
DESCRIPTION = "Package rubberband-lv2 contains the rubberband LV2 plugin."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "rubberband-lv2-4.0.0-1.6.aarch64.rpm"
RPM_HASH = "f0c189194619ac5a1123cc7c3e4170a2cac11c61c2dc753d05c18f0b8cce7ac090f5954613a6864b69a8e6242deeb50c7ab3a5dea4e49243b93081e4405d18e3"

RPROVIDES:${PN} += "rubberband-lv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband3 \
libstdc++.so.6"

inherit rpm
