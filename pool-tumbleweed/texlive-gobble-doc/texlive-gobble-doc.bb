SUMMARY = "Documentation for texlive-gobble"
DESCRIPTION = "This package includes the documentation for texlive-gobble"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn64967"

RPM_NAME = "texlive-gobble-doc-2026.226.0.0.2svn64967-60.4.noarch.rpm"
RPM_HASH = "e559228ead5f8aaaa90f952a3410f2ddb1d99431e615789100437d5ad1f16836f948f19f9b3c7dc68a0af6790663e2dcb3460db73a9b948c865237c839252c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gobble-doc"

RDEPENDS:${PN} += ""

inherit rpm
