SUMMARY = "Documentation for texlive-comfortaa"
DESCRIPTION = "This package includes the documentation for texlive-comfortaa"
LICENSE = "OFL-1.1"

PV = "2026.226.3.2svn77682"

RPM_NAME = "texlive-comfortaa-doc-2026.226.3.2svn77682-60.2.noarch.rpm"
RPM_HASH = "381809a847719dd042bd0d9984b31c708ae4a5be517a4ae28066c9b82003e1ac7af37a7b87f16b9fd4ec578caaabf5d6195a070ea959ad4a4659489055709451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comfortaa-doc"

RDEPENDS:${PN} += ""

inherit rpm
