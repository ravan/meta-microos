SUMMARY = "Documentation for texlive-babel-irish"
DESCRIPTION = "This package includes the documentation for texlive-babel-irish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0hsvn77682"

RPM_NAME = "texlive-babel-irish-doc-2026.226.1.0hsvn77682-60.2.noarch.rpm"
RPM_HASH = "87e093097ee09a10960c7f1d1ff07fa29c12d9817241fb927fb134027a37f1107dc9a404400f9654955deba6552f29e38d81e81651468a573e64ed9bfdc3d27a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-irish-doc"

RDEPENDS:${PN} += ""

inherit rpm
