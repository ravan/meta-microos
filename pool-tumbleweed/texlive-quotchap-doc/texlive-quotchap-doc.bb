SUMMARY = "Documentation for texlive-quotchap"
DESCRIPTION = "This package includes the documentation for texlive-quotchap"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-quotchap-doc-2026.226.1.3svn77682-60.4.noarch.rpm"
RPM_HASH = "99e3052d085e8799011465a02de48e94e8d34d2d83e742645a4e15934c717404d20daf5ee18d83f89e973743e0e1399d266aa73d2388399fb57f403b201ceb63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quotchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
