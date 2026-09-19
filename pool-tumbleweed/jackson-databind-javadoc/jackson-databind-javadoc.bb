SUMMARY = "Javadoc for jackson-databind"
DESCRIPTION = "This package contains API documentation for jackson-databind."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-databind-javadoc-2.18.9-2.2.noarch.rpm"
RPM_HASH = "5518806176af3476cc05c455eac242c62bd8e4a82b9f6b174cee8aaa7fd69fcd696844a4b362e543e66234ba48c40f9e42ab7806cc958a344c9e97e4fcf6c63b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-databind-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
