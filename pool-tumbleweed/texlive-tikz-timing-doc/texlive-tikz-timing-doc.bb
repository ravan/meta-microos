SUMMARY = "Documentation for texlive-tikz-timing"
DESCRIPTION = "This package includes the documentation for texlive-tikz-timing"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7fsvn64967"

RPM_NAME = "texlive-tikz-timing-doc-2026.226.0.0.7fsvn64967-59.2.noarch.rpm"
RPM_HASH = "ed8aa04ddbe707da7f0ce078221cd9e409eaaadd60865c11d7cfb6f49509d9956e50eeab326f896cd1f3d414ae8e5d4fdcff0c4842114b8fb621c0757780709f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-timing-doc"

RDEPENDS:${PN} += ""

inherit rpm
