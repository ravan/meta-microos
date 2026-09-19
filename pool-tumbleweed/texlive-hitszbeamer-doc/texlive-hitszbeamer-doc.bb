SUMMARY = "Documentation for texlive-hitszbeamer"
DESCRIPTION = "This package includes the documentation for texlive-hitszbeamer"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn54381"

RPM_NAME = "texlive-hitszbeamer-doc-2026.226.1.0.0svn54381-60.4.noarch.rpm"
RPM_HASH = "d36cacb5084938e7bcca7368b085a6218606a28a6ea448984754486777804024885d5cec986c0ab2a757c9ca1c360cd1ca970fc0d9345af0f40fcde01b050133"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitszbeamer-doc-zh \
texlive-hitszbeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
