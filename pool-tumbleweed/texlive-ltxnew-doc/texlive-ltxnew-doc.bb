SUMMARY = "Documentation for texlive-ltxnew"
DESCRIPTION = "This package includes the documentation for texlive-ltxnew"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn21586"

RPM_NAME = "texlive-ltxnew-doc-2026.226.1.3svn21586-59.2.noarch.rpm"
RPM_HASH = "7f9d170fa7ee30aa6b0177d7368b2b7f0f5cd2545cb7d2af1bad99a271afc6fb9d783e3f3b3482820f68292f2ab868f21d4d8c252881f5689e5cf9705428ddd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxnew-doc"

RDEPENDS:${PN} += ""

inherit rpm
