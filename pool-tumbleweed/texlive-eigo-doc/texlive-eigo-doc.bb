SUMMARY = "Documentation for texlive-eigo"
DESCRIPTION = "This package includes the documentation for texlive-eigo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn78101"

RPM_NAME = "texlive-eigo-doc-2026.226.1svn78101-61.4.noarch.rpm"
RPM_HASH = "cbe179258c1703b0053abe9c0c2b7f0d83c5ca3ce0b449f5eaf4e8f96adb291acd3556e4d313a1c606a63e23cbdbedc81fbdaebf7a5adb872d2d2cd17c21c608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eigo-doc"

RDEPENDS:${PN} += ""

inherit rpm
