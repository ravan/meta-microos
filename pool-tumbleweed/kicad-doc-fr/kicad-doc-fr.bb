SUMMARY = "French documentation and tutorials for KiCad"
DESCRIPTION = "This package contains French documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-fr-10.0.6-1.1.noarch.rpm"
RPM_HASH = "a81f625fe4488601a84be49d6faef1202b0abaa2723a3ff6aa489800ac80fbc76eec88cfbe21b001bf9a34c01d98d8a064c821a08c4424458a195485b5553794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-fr \
locale-kicad-doc-fr"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
