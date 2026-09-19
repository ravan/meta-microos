SUMMARY = "Documentation for texlive-flabels"
DESCRIPTION = "This package includes the documentation for texlive-flabels"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn17272"

RPM_NAME = "texlive-flabels-doc-2026.226.1.0svn17272-59.2.noarch.rpm"
RPM_HASH = "c4f7bb77a37b1caae4a16211fd3d90a9e971811aae1b3b971370ec080ca2572a7533a51b49261afa278112f2f4ba5eada0a0a62f74a2c2638154f031cc9dfcd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flabels-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
