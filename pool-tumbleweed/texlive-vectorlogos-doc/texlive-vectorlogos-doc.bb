SUMMARY = "Documentation for texlive-vectorlogos"
DESCRIPTION = "This package includes the documentation for texlive-vectorlogos"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn73069"

RPM_NAME = "texlive-vectorlogos-doc-2026.226.0.0.1.3svn73069-60.2.noarch.rpm"
RPM_HASH = "7b28688b72c59abb9c8fc021d65864ac78116c90b35ed8587e8215fa4be4ae38102959632d241387d6b79d54ae2b91cdc53f03c476fdcafdecb9de59554302a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vectorlogos-doc"

RDEPENDS:${PN} += ""

inherit rpm
