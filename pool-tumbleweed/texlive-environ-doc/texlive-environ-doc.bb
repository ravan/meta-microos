SUMMARY = "Documentation for texlive-environ"
DESCRIPTION = "This package includes the documentation for texlive-environ"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-environ-doc-2026.226.0.0.3svn77682-61.4.noarch.rpm"
RPM_HASH = "9ad7b43a490a57aa310e4cbba7782b2b3918dd04364911a78f16fa8624b30997dc92abb10eb8d176b6d89deb25f7a513cc8d80068c4d82471e133b894aa64752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-environ-doc"

RDEPENDS:${PN} += ""

inherit rpm
