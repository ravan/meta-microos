SUMMARY = "Documentation for texlive-disser"
DESCRIPTION = "This package includes the documentation for texlive-disser"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.0svn43417"

RPM_NAME = "texlive-disser-doc-2026.226.1.5.0svn43417-59.2.noarch.rpm"
RPM_HASH = "58bcfe8d575921f1f4155dd8fce3af082b062c1599740169348ec483343fb56ab22aa3e1ce24d8b91e62fed6c2ac83f4395401a4fd899f8df8d4eca55552ccb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-disser-doc-ru;en \
texlive-disser-doc"

RDEPENDS:${PN} += ""

inherit rpm
