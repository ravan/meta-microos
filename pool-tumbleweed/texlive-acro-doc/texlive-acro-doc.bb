SUMMARY = "Documentation for texlive-acro"
DESCRIPTION = "This package includes the documentation for texlive-acro"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.8svn77682"

RPM_NAME = "texlive-acro-doc-2026.226.3.8svn77682-61.2.noarch.rpm"
RPM_HASH = "40bc7b597d8207b732501c2fa2c711848ad66bf7650e5abd9c54a3df8163002c784d63d144b7c4068b90e4bd5a079e0821f7c6b3130100bf6a73e0318cbccf0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acro-doc"

RDEPENDS:${PN} += ""

inherit rpm
