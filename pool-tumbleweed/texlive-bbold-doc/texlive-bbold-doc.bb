SUMMARY = "Documentation for texlive-bbold"
DESCRIPTION = "This package includes the documentation for texlive-bbold"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-bbold-doc-2026.226.1.01svn77682-61.2.noarch.rpm"
RPM_HASH = "d0a4c82b54ca99563a024f70d443d05b096941250dfa82960de96244a210639c00d1da89ff7c0d435a4eec621a9f1451f68514cd78326f9df01b84ee35607e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbold-doc"

RDEPENDS:${PN} += ""

inherit rpm
