SUMMARY = "Documentation for texlive-lengthconvert"
DESCRIPTION = "This package includes the documentation for texlive-lengthconvert"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn76924"

RPM_NAME = "texlive-lengthconvert-doc-2026.226.1.0asvn76924-61.2.noarch.rpm"
RPM_HASH = "7b72585bcabb15f794cb9398bfc0292141f3ac5a1ebcaf12c12de2635d26b972a27184ccb77ea96506677474c109b6a1ad4bb3156d7feb73af7822fae9396aa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lengthconvert-doc"

RDEPENDS:${PN} += ""

inherit rpm
