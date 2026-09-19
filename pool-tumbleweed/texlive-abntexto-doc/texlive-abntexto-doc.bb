SUMMARY = "Documentation for texlive-abntexto"
DESCRIPTION = "This package includes the documentation for texlive-abntexto"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4.0.5_betasvn76889"

RPM_NAME = "texlive-abntexto-doc-2026.226.4.0.5_betasvn76889-61.2.noarch.rpm"
RPM_HASH = "07eec74430c184f8a0e9fc0fceb54d698d1d3847240e94d727a79619581c561fb0020b515fee6bfd363b5cb401bf9df4cf0eb0164a5d5b3040ce7e9362a2ae6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-abntexto-doc-pt-BR \
texlive-abntexto-doc"

RDEPENDS:${PN} += ""

inherit rpm
