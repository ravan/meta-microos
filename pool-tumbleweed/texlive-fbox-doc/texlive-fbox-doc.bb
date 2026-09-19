SUMMARY = "Documentation for texlive-fbox"
DESCRIPTION = "This package includes the documentation for texlive-fbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.07svn77682"

RPM_NAME = "texlive-fbox-doc-2026.226.0.0.07svn77682-59.2.noarch.rpm"
RPM_HASH = "3ab54f5d65ba67aeee7436f0bd12623e18fbb5737cabd4cfefb6e8f011cdc8e4356dd77b58018c8a961d8396ab95252f4b7a3bedde9e5b32e9210f4061e84295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
