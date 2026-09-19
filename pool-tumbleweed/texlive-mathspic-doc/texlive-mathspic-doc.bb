SUMMARY = "Documentation for texlive-mathspic"
DESCRIPTION = "This package includes the documentation for texlive-mathspic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.13svn31957"

RPM_NAME = "texlive-mathspic-doc-2026.226.1.13svn31957-59.2.noarch.rpm"
RPM_HASH = "d6dd90d556de3771c8464177d107789227744370b49ef223b04c5545c2471cbc44b3fbf9307d443eeb1334f2e3be632f8a40bdbefc2408bb7080147b00a5e950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mathspic.1 \
texlive-mathspic-doc"

RDEPENDS:${PN} += ""

inherit rpm
