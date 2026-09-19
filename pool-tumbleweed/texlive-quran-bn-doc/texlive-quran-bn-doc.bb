SUMMARY = "Documentation for texlive-quran-bn"
DESCRIPTION = "This package includes the documentation for texlive-quran-bn"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21svn74830"

RPM_NAME = "texlive-quran-bn-doc-2026.226.0.0.21svn74830-60.4.noarch.rpm"
RPM_HASH = "f3e8944cdb31b836cb5c74d9ca9d690244183e6f3e1cc63a78f68c228023186566f4df473560f4f7dc47799e73a9cc0866a959c0fa3ea726fbd0f41d145ae939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-bn-doc"

RDEPENDS:${PN} += ""

inherit rpm
