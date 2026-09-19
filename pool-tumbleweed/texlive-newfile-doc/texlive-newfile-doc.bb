SUMMARY = "Documentation for texlive-newfile"
DESCRIPTION = "This package includes the documentation for texlive-newfile"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0csvn15878"

RPM_NAME = "texlive-newfile-doc-2026.226.1.0csvn15878-61.2.noarch.rpm"
RPM_HASH = "911917b35b8069695f85f7a2fd7e98089ff72d6e47c672dbf874828715bfaba4695d1da04800cfddde25d663038e09db4f5e8dbfc4e3cf03532e46296c818316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
