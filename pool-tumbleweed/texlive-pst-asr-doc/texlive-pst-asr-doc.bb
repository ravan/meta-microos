SUMMARY = "Documentation for texlive-pst-asr"
DESCRIPTION = "This package includes the documentation for texlive-pst-asr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn22138"

RPM_NAME = "texlive-pst-asr-doc-2026.226.1.3svn22138-59.2.noarch.rpm"
RPM_HASH = "32d4a572896c3104b4c89c5725deb1f7b066815205f75f803d81304af9f09a62c5592014915f86103a24318edda9b3a00772b8b87a495bfba89c728718a6487e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-asr-doc"

RDEPENDS:${PN} += ""

inherit rpm
