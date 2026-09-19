SUMMARY = "GAP: OpenMath functionality in GAP"
DESCRIPTION = "The package provides an OpenMath phrasebook for GAP: it allows GAP \
users to import and export mathematical objects encoded in OpenMath, \
for the purpose of exchanging them with other OpenMath-enabled \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "11.5.5"

RPM_NAME = "gap-openmath-11.5.5-1.1.noarch.rpm"
RPM_HASH = "6600cd9db09f53c4f081368e2e395194e13bcac03226357026e22b9e0449e1d5fce16b94aae1fc7bd038250ae1c928a43f0f48666a763ec0d7eccb9560d2fbad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-openmath"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-io"

inherit rpm
