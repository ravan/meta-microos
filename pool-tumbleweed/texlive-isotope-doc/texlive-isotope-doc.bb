SUMMARY = "Documentation for texlive-isotope"
DESCRIPTION = "This package includes the documentation for texlive-isotope"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn23711"

RPM_NAME = "texlive-isotope-doc-2026.226.0.0.3svn23711-63.2.noarch.rpm"
RPM_HASH = "516aaec1db253dc2d6346ff1b079938e154280d88dabc0fbf409483151a4e37c4e3d7b559e48ea66a455a9fd549aedd314dc2b8d576d8508827cdf1ba209a15a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isotope-doc"

RDEPENDS:${PN} += ""

inherit rpm
