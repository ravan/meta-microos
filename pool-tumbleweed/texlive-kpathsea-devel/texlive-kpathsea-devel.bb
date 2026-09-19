SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.4.2"

RPM_NAME = "texlive-kpathsea-devel-6.4.2-120.4.aarch64.rpm"
RPM_HASH = "e7b594c7e12986a3cc0ed6dc7f1f8d5f8d29068120a2078c2bd9274eba3deae7ec54db1f0142cb6772280b03e6d4b9a097c2bfc73aacb3aec40b8374056315c2"

RPROVIDES:${PN} += "pkgconfig-kpathsea \
texlive-kpathsea-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkpathsea6"

inherit rpm
