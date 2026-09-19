SUMMARY = "Documentation for texlive-lstbayes"
DESCRIPTION = "This package includes the documentation for texlive-lstbayes"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn48160"

RPM_NAME = "texlive-lstbayes-doc-2026.226.svn48160-59.2.noarch.rpm"
RPM_HASH = "b9e38e497080504892ac3993b799491072782a476d720146754b492982917f3f3538063a520f4c0804853a74331d0836eaf84ee5b47b71dec29ed129ddd24165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lstbayes-doc"

RDEPENDS:${PN} += ""

inherit rpm
