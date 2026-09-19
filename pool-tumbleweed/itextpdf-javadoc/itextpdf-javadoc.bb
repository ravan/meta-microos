SUMMARY = "API documentation for itextpdf"
DESCRIPTION = "This package contains the API documentation for itextpdf."
LICENSE = "AGPL-3.0-only"

PV = "5.5.13.4"

RPM_NAME = "itextpdf-javadoc-5.5.13.4-1.4.noarch.rpm"
RPM_HASH = "0debe94fd8975a5d8b5f88ba41ca4851a78a335930ac03d65c80ec05b8d4231efe47ac734502d414d42214a771430a04c8b13ab9ce3a391bdff45ff3d20af39b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itextpdf-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
