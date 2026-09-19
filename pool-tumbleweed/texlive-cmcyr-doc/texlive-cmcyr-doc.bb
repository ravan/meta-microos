SUMMARY = "Documentation for texlive-cmcyr"
DESCRIPTION = "This package includes the documentation for texlive-cmcyr"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn68681"

RPM_NAME = "texlive-cmcyr-doc-2026.226.svn68681-60.2.noarch.rpm"
RPM_HASH = "571fdbcf1b13992baa9fc13404dcc0c7181d8af5dd9b4865b7ce0d3300eea7e01c181e76abd219745efda7f826af1b1cb12e9f4f6c6a797b22ce5c63fc31ba5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmcyr-doc"

RDEPENDS:${PN} += ""

inherit rpm
