SUMMARY = "Documentation for texlive-uwmslide"
DESCRIPTION = "This package includes the documentation for texlive-uwmslide"
LICENSE = "Artistic-1.0"

PV = "2026.226.svn27354"

RPM_NAME = "texlive-uwmslide-doc-2026.226.svn27354-60.2.noarch.rpm"
RPM_HASH = "0d5353abd54d62c66042042697a8a8c33b387b8c95e207b5a62cabbcf94533ee9d4edf4f18d9369fd675272cef3a40cc2e94dd02885e3f5db9c7d8bb51b63923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwmslide-doc"

RDEPENDS:${PN} += ""

inherit rpm
