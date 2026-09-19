SUMMARY = "German documentation and tutorials for KiCad"
DESCRIPTION = "This package contains German documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-de-10.0.6-1.1.noarch.rpm"
RPM_HASH = "80f23334567b9818af4ca140bcdad91d0e829c8322e5b5c95088a68fc00e6cfebe5bcdad1dfce6647b7129a1f5e4c27ac109ad02709edf166e7f8e7e2ad21302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-de \
locale-kicad-doc-de"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
