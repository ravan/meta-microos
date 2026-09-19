SUMMARY = "Documentation for texlive-xunicode"
DESCRIPTION = "This package includes the documentation for texlive-xunicode"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.981svn77682"

RPM_NAME = "texlive-xunicode-doc-2026.226.0.0.981svn77682-59.4.noarch.rpm"
RPM_HASH = "1a12736e859d44f4b79642e94de307dd148d53309fdada0b8180e2279dca83dd47ee1109b03da9060b50035bded0c80027175cfe962634258a346a9b82286972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xunicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
