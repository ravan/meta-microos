SUMMARY = "Fonts for the MathGL library"
DESCRIPTION = "This package contains command fonts for MathGL library."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "mathgl-fonts-8.0.3-2.6.noarch.rpm"
RPM_HASH = "9d581dd5b004dfae81b54d279ea59986f353334242b55da7e666b1f8644a4abd6b90800c94daaad53aa2491497bc1fdafeec90ee8a8350fff873f5d856c30d7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-fonts"

RDEPENDS:${PN} += ""

inherit rpm
