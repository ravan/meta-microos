SUMMARY = "Documentation for texlive-haranoaji"
DESCRIPTION = "This package includes the documentation for texlive-haranoaji"
LICENSE = "OFL-1.1"

PV = "2026.226.20250811svn76078"

RPM_NAME = "texlive-haranoaji-doc-2026.226.20250811svn76078-60.4.noarch.rpm"
RPM_HASH = "27cbbac2c69beb7f4ed8cd402a770d3e23e856a6423daf26d9c2c8b7e5d4db7ca715693a9a8dad868d6277c302db99fe7e3ff51c8badfc54779bdd68ed33544b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-doc"

RDEPENDS:${PN} += ""

inherit rpm
