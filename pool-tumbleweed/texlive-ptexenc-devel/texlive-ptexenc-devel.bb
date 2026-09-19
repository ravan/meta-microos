SUMMARY = "Libraries of Kanji code convert library for pTeX"
DESCRIPTION = "This package includes the ptexenc development files. \
The ptexenc is a useful library for Japanese pTeX \
(which stands for publishing TeX, and is an extension of \
TeX by ASCII Co.) and its surrounding tools."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "texlive-ptexenc-devel-1.5.2-120.4.aarch64.rpm"
RPM_HASH = "c3d2dff019b507d65aa3df24fb924cb66438e3604452e0b29d5ade80b5184a87e44086f422dd3dda5cf7f842b4b93f1e2faeec7cd61f7f519426ce5252239be2"

RPROVIDES:${PN} += "pkgconfig-ptexenc \
texlive-ptexenc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptexenc1 \
pkgconfig-kpathsea"

inherit rpm
