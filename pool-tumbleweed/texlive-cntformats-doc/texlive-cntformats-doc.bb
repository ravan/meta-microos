SUMMARY = "Documentation for texlive-cntformats"
DESCRIPTION = "This package includes the documentation for texlive-cntformats"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn34668"

RPM_NAME = "texlive-cntformats-doc-2026.226.0.0.7svn34668-60.2.noarch.rpm"
RPM_HASH = "dffeb044d32361ecc0936accf12a01fe4071ca25cad2bae2687c13bfe1915639ce5d5cff5a6cfc45f9b642a4e72294779138d726149028c3594c1ebe1758dda8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cntformats-doc"

RDEPENDS:${PN} += ""

inherit rpm
