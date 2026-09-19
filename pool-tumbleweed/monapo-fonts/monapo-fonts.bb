SUMMARY = "Monapo Japanese Truetype font"
DESCRIPTION = "This package provides 'monapo' Japanese TrueType font which is \
based on IPA fonts (v3).  Monapo font is adjusted to be compatible \
with MS P Gothic so that it can show Japanese Ascii Art properly."
LICENSE = "IPA"

PV = "20170722"

RPM_NAME = "monapo-fonts-20170722-1.18.noarch.rpm"
RPM_HASH = "97a2078fd1e4b85a75f4b279dcc82964f2806423bc9d38b6ae3e5da2bf4fdb3dc61e47ddcff5a1283ad38673709d23cac2594cdb871c8dd8554499ae5381ad5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ja \
monapo \
monapo-font \
monapo-fonts \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
