SUMMARY = "Documentation for texlive-nwafuthesis"
DESCRIPTION = "This package includes the documentation for texlive-nwafuthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.25svn76924"

RPM_NAME = "texlive-nwafuthesis-doc-2026.226.1.25svn76924-61.2.noarch.rpm"
RPM_HASH = "fa9b28c63b80367c8628767ed81b0e48f6c30af0508ea873cf1f5019d9421a2393537622e878555a7e9451ac450edcd856c1d42fb3864ce4fc513dee74cf72a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nwafuthesis-doc-zh \
texlive-nwafuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
