SUMMARY = "Documentation for texlive-unicode-bidi"
DESCRIPTION = "This package includes the documentation for texlive-unicode-bidi"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77682"

RPM_NAME = "texlive-unicode-bidi-doc-2026.226.0.0.01svn77682-60.2.noarch.rpm"
RPM_HASH = "d30eefaed2dd7dbb5762d59e8f67e9e691ef702ed951c855134d11d74f1535c8c9c9eeb7e459ac6a503b18eb6dc776cdaa1e52db97e14654ed457bab5562ce50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-bidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
