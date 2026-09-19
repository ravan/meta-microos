SUMMARY = "Javadoc for plexus-build-api"
DESCRIPTION = "API documentation for plexus-build-api."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "plexus-build-api-javadoc-1.2.0-3.5.noarch.rpm"
RPM_HASH = "01dd3364e391eaf0385f1c73af8c524ef9443639cb2caaf6274cf058a1e54c3bfa1d87b06f4b908ddac2653acb476cbe6c542efd980c1aec699bea6142fbe68e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-build-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
