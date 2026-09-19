SUMMARY = "Documentation for texlive-esieecv"
DESCRIPTION = "This package includes the documentation for texlive-esieecv"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59638"

RPM_NAME = "texlive-esieecv-doc-2026.226.svn59638-61.4.noarch.rpm"
RPM_HASH = "14c411ab04fc12401c347a4ed229323183c7981dd776e86f2daeb610345eb14ed6dfe60fc747d9b01e04533fa37a6736a009d22b2b2d09cbb15da2c898238323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esieecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
