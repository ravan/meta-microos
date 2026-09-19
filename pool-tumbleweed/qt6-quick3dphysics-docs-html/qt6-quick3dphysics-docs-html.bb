SUMMARY = "Documentation for qt6-quick3dphysics in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quick3dphysics in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dphysics-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "933ab6b5882020c79704ba4c4aeffd43d39894eb2a279eb4f09801a72f5b0df82e3494d1186318829e7527e88bec23ddba114678a51e06948ef9932e913c585a"

RPROVIDES:${PN} += "qt6-quick3dphysics-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
