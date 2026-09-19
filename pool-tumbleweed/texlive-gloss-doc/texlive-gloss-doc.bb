SUMMARY = "Documentation for texlive-gloss"
DESCRIPTION = "This package includes the documentation for texlive-gloss"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.2svn75240"

RPM_NAME = "texlive-gloss-doc-2026.226.1.5.2svn75240-60.4.noarch.rpm"
RPM_HASH = "91d88178dc1b243b1519c1188098ca63f500993631322747a63d5f4e2ea58be799f31cbbda00208d323a02530270774b20a493e20e233c34cf3d4dbeacf147f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-doc"

RDEPENDS:${PN} += ""

inherit rpm
