SUMMARY = "Documentation for texlive-guitar"
DESCRIPTION = "This package includes the documentation for texlive-guitar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn32258"

RPM_NAME = "texlive-guitar-doc-2026.226.1.6svn32258-60.4.noarch.rpm"
RPM_HASH = "22db6728873319b42df77617f55c77033065a84865465a69fce55672296ca74d6807a27b041fce04e2da853074d07941ec037df07c386dd4a1c8e87b63149d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guitar-doc"

RDEPENDS:${PN} += ""

inherit rpm
