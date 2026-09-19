SUMMARY = "Fonts from the UniFraktur project"
DESCRIPTION = "Unifraktur provides a number of Fraktur blackletter font faces that \
are optimized for @font-face embedding with CSS. \
 \
UnifrakturMaguntia is a weight-400 font baſed on Peter Wiegel’s font \
'Berthold Mainzer Fraktur'. \
 \
UnifrakturCook is a weight-700 font baſed on Peter Wiegel’s 'Koch \
Fette Deutſche Schrift'. UnifrakturCook uſes the wideſt poſſible \
range of modern ſmart font technologies for diſplaying the font’s \
ligatures, OpenType, Apple Advanced Typography (AAT) and SIL \
Graphite."
LICENSE = "OFL-1.1"

PV = "0.20170319"

RPM_NAME = "unifraktur-fonts-0.20170319-1.18.noarch.rpm"
RPM_HASH = "928fb9b0a647b68222d1e4a080ec941c67e45b382ec1c1335c9ff1f507479f6c4964c2e6b4cf2c2f42e44a7124c8dd71389148f37412384f00211b0003176cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unifraktur-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
