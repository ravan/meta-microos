SUMMARY = "Documentation for texlive-mslapa"
DESCRIPTION = "This package includes the documentation for texlive-mslapa"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-mslapa-doc-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "3b83373d757396e62a06f4517124461c99426d196a837fac30c0ed518f6c0fb669e24b7b6acb1429fe369367ec110072e70441dfe333d9d184b3d5425b0b875f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mslapa-doc"

RDEPENDS:${PN} += ""

inherit rpm
