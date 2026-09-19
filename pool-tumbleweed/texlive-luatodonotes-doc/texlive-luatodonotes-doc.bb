SUMMARY = "Documentation for texlive-luatodonotes"
DESCRIPTION = "This package includes the documentation for texlive-luatodonotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5asvn77682"

RPM_NAME = "texlive-luatodonotes-doc-2026.226.0.0.5asvn77682-59.2.noarch.rpm"
RPM_HASH = "8947de71a15ccb02f88cbdacde69f9fc688dd6127eeb18c45a795dc7f3f3f3f8e558380fcded620110c98686ff2b12891c81a1c00c0c4e8320052dd2bafed53e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatodonotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
