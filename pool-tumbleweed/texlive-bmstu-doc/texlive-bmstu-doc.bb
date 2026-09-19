SUMMARY = "Documentation for texlive-bmstu"
DESCRIPTION = "This package includes the documentation for texlive-bmstu"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn65897"

RPM_NAME = "texlive-bmstu-doc-2026.226.2.0.0svn65897-59.2.noarch.rpm"
RPM_HASH = "7feabee86c794197d14bc6ad72d3293545de01c743effb2e7b20e5dc86ac8ad8944ae08467d3c30c1acb7ead89b028ac27268b69a7d174c602a586330cb75c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bmstu-doc"

RDEPENDS:${PN} += ""

inherit rpm
