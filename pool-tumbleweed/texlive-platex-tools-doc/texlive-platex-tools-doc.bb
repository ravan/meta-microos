SUMMARY = "Documentation for texlive-platex-tools"
DESCRIPTION = "This package includes the documentation for texlive-platex-tools"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn72097"

RPM_NAME = "texlive-platex-tools-doc-2026.226.svn72097-59.2.noarch.rpm"
RPM_HASH = "6513798edd3d657b8c33b30b98241ffdcc2cea37cb50411b0f7c5084be7fabb66bf140afb24ad803d5c82e328a662f044c3cc6aa2f9683df1e086c39f2e5be9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-platex-tools-doc-ja \
texlive-platex-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
