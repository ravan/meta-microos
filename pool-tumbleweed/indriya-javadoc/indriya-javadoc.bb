SUMMARY = "Javadoc for the Units of Measurement Libraries"
DESCRIPTION = "Javadoc for the Units of Measurement Libraries"
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "indriya-javadoc-1.3-6.4.noarch.rpm"
RPM_HASH = "9f9d6263083f43becddd8205be87aa45af308b358535fff23675fb8c40761e64d19508d72558c3bf38a390fd7ed8aa93bb38bf07f2c6d90d0d7de0d330d515eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indriya-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
