SUMMARY = "Javadoc for maven-invoker"
DESCRIPTION = "API documentation for maven-invoker."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-invoker-javadoc-3.3.0-2.6.noarch.rpm"
RPM_HASH = "9107a299722638ae575a8fd83c2a2d9af452656373f41ce2cd8ebf3563e33f2f0d9eca79680146525943efb8d65de3289180bb01c3a154a1f1695e0495e36cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
