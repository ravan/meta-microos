SUMMARY = "Documentation for texlive-nath"
DESCRIPTION = "This package includes the documentation for texlive-nath"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-nath-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "cd1308d21100b60bc37ed22361981800f3cb30f2324c92ec9dc32db6ed90250952be510fdbbe926d0794f12eb5c2e20ef45ded4f31534381a5af5c0e273c0777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nath-doc"

RDEPENDS:${PN} += ""

inherit rpm
