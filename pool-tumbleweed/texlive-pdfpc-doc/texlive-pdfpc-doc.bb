SUMMARY = "Documentation for texlive-pdfpc"
DESCRIPTION = "This package includes the documentation for texlive-pdfpc"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7.1svn68610"

RPM_NAME = "texlive-pdfpc-doc-2026.226.0.0.7.1svn68610-58.2.noarch.rpm"
RPM_HASH = "c92b0f0cfb8f8b4ecf3fcaf9240880bf51db75eb61963f9dfbc6a9249cf576ba9772721c2b09108c0ea0690e3026914b649e001b0303cc8c5577da816716311e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
