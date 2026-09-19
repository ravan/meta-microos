SUMMARY = "Documentation for texlive-pdfx"
DESCRIPTION = "This package includes the documentation for texlive-pdfx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.5fsvn77682"

RPM_NAME = "texlive-pdfx-doc-2026.226.1.6.5fsvn77682-58.2.noarch.rpm"
RPM_HASH = "9c47dd02c66888a95aa37fd2e729c9c4731d86cbe1d2addde6a2e14a81cafaa00d70ef0ec2c35b8d1d1c8e9c941c108229ec14e67b61a4c0a2145001735f00e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfx-doc"

RDEPENDS:${PN} += ""

inherit rpm
