SUMMARY = "Documentation for texlive-mkgrkindex"
DESCRIPTION = "This package includes the documentation for texlive-mkgrkindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn26313"

RPM_NAME = "texlive-mkgrkindex-doc-2026.226.2.0svn26313-61.2.noarch.rpm"
RPM_HASH = "f09cf735605e0ab2e9133e31886f0127774f8fb561dbd5824e5573bbd6b7dee7fcf277e66bc00c25aa80f22ff92e936f6465691cafc007e53ca9869f509e6a80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkgrkindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
