SUMMARY = "Javadoc for maven-compiler-plugin"
DESCRIPTION = "API documentation for maven-compiler-plugin."
LICENSE = "Apache-2.0"

PV = "3.16.0"

RPM_NAME = "maven-compiler-plugin-javadoc-3.16.0-1.1.noarch.rpm"
RPM_HASH = "cdf83dd127f49cac9699232c6314eb231a81340cd63478ed7d5599739c3409ed3d19913c34914866b2119dda2bc8283f8cd32b49a8623e673c3f822e11613945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-compiler-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
