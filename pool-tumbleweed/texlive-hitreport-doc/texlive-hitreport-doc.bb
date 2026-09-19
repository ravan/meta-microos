SUMMARY = "Documentation for texlive-hitreport"
DESCRIPTION = "This package includes the documentation for texlive-hitreport"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn58357"

RPM_NAME = "texlive-hitreport-doc-2026.226.1.0.0svn58357-60.4.noarch.rpm"
RPM_HASH = "ed0428c1716b592256a770c94b9c0a0425e8dc32252738c01b98de0b82af3157b84f4bde3c2ccc210a291bfc9fdc48ec33055f8f9ff114fa4a719b87857a4e74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitreport-doc-zh \
texlive-hitreport-doc"

RDEPENDS:${PN} += ""

inherit rpm
