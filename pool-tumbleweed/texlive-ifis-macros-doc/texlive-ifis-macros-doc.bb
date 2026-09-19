SUMMARY = "Documentation for texlive-ifis-macros"
DESCRIPTION = "This package includes the documentation for texlive-ifis-macros"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0svn75195"

RPM_NAME = "texlive-ifis-macros-doc-2026.226.2.0svn75195-60.2.noarch.rpm"
RPM_HASH = "08cb574d6668486cbfa5ae21afc147f73f7a9f8366e0f90a21a462175f812a0e64faca41198eccfe71e9dad6f4acdd9638319446bb5ab8aa61830a9b06aef7fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifis-macros-doc"

RDEPENDS:${PN} += ""

inherit rpm
