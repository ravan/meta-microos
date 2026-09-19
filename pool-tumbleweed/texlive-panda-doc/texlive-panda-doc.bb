SUMMARY = "Documentation for texlive-panda"
DESCRIPTION = "This package includes the documentation for texlive-panda"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn78101"

RPM_NAME = "texlive-panda-doc-2026.226.0.0.3svn78101-58.2.noarch.rpm"
RPM_HASH = "46d8ccc28636fefeba7a5cd40cae305d4d24194b4e1f2b0c7769f6c459156820fb0400f2677ef06a9f41b279052d136979c47b9afbb61e4116ee0381012bffe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-panda-doc"

RDEPENDS:${PN} += ""

inherit rpm
