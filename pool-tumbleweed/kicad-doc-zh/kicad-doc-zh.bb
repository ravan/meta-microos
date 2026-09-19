SUMMARY = "Chinese documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Chinese documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-zh-10.0.6-1.1.noarch.rpm"
RPM_HASH = "06121b022062aae503221015c4548037802e07b9ac755a2341e32e54a110e33bae23d9ac3a9ae1c4f3c8b0e404490d15600a94b828faf83baf376f970f57a6df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-zh \
locale-kicad-doc-zh"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
