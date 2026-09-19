SUMMARY = "Documentation for texlive-ecc"
DESCRIPTION = "This package includes the documentation for texlive-ecc"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-ecc-doc-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "4eeb29b59f08fa75002ecf55360b20fc022487af4b2e6dc88e3147a176c4d40087dc59e02ac5fe911ca4ea2d5f8b8cd885300be8defc32cb6d1291b99d2d5a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecc-doc"

RDEPENDS:${PN} += ""

inherit rpm
