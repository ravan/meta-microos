SUMMARY = "Documentation for texlive-phfnote"
DESCRIPTION = "This package includes the documentation for texlive-phfnote"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn60733"

RPM_NAME = "texlive-phfnote-doc-2026.226.4.0svn60733-58.2.noarch.rpm"
RPM_HASH = "dcc1abd06cf41505d251361b730ccc4fea5cd28eff8da054e9152636bbcf6a10492f32837c3422e8f430695e2ac764e08e380dd3c2ab246e4777f7a5aabab7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
