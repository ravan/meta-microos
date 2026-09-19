SUMMARY = "Documentation for texlive-showkerning"
DESCRIPTION = "This package includes the documentation for texlive-showkerning"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn67603"

RPM_NAME = "texlive-showkerning-doc-2026.226.0.0.3svn67603-60.2.noarch.rpm"
RPM_HASH = "cd6f4acbf867062be2147b98c4b040bfdb36e7a59cb82ea81de958e22f243dfb53e0fb30387a047eb5befe3e2bd9d107655986458c39a8c216e7d318c976abc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showkerning-doc"

RDEPENDS:${PN} += ""

inherit rpm
