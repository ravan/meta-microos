SUMMARY = "Documentation for texlive-euenc"
DESCRIPTION = "This package includes the documentation for texlive-euenc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1hsvn19795"

RPM_NAME = "texlive-euenc-doc-2026.226.0.0.1hsvn19795-59.2.noarch.rpm"
RPM_HASH = "5f75c2cb31e85b257d4a34a6da8e99c33bf78b63e037452d007d68c939cb36715915d9afc8c72b81a1904ba5947a023cf7efc2c07113aef9a40fb529b65b46dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
