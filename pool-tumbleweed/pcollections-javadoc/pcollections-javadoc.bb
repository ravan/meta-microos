SUMMARY = "API documentation for pcollections"
DESCRIPTION = "API documentation for pcollections."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "pcollections-javadoc-5.0.0-1.4.noarch.rpm"
RPM_HASH = "12468ea4ef7871d55ddd458e2ddb862e387a1065d3c99870345a4abd38cad6a7c8fcffc4ec58bee031af78d908b94f9d86dde792479472b837a3a0ef0fe15f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcollections-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
