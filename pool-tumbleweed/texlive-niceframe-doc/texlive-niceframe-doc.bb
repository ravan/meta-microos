SUMMARY = "Documentation for texlive-niceframe"
DESCRIPTION = "This package includes the documentation for texlive-niceframe"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1csvn77682"

RPM_NAME = "texlive-niceframe-doc-2026.226.1.1csvn77682-61.2.noarch.rpm"
RPM_HASH = "8f273ff6efe94d45697cc63bd7072fd162c4a6dfab8cda9369d5e2790466cd5b1a51d83a44875e91977568a45eb4d2d321a2781e62267eeed448181c754e4090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-niceframe-doc"

RDEPENDS:${PN} += ""

inherit rpm
