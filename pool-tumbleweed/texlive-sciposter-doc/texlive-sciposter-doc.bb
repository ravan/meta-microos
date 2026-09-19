SUMMARY = "Documentation for texlive-sciposter"
DESCRIPTION = "This package includes the documentation for texlive-sciposter"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.18svn15878"

RPM_NAME = "texlive-sciposter-doc-2026.226.1.18svn15878-60.2.noarch.rpm"
RPM_HASH = "80ffc3f41c3817cc5a3bfe873343674ebb3a5987d518b95c63b957b58f6f9ec1d13c1ee32e02b37c2e5bbf679d50789c5b30dc8b381c87d58f9e03b08e7869ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sciposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
