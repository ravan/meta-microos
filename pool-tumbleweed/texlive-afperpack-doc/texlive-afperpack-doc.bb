SUMMARY = "Documentation for texlive-afperpack"
DESCRIPTION = "This package includes the documentation for texlive-afperpack"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0bsvn77050"

RPM_NAME = "texlive-afperpack-doc-2026.226.1.0bsvn77050-61.2.noarch.rpm"
RPM_HASH = "761e7bd3cf2da15b5cdd91a471a2b47821417dc5ba6c46e47a57548bd1dcd7a1983915b0c570504deeb4351da92c52aaee010bb33f6cb464f235751e1e978b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-afperpack-doc"

RDEPENDS:${PN} += ""

inherit rpm
