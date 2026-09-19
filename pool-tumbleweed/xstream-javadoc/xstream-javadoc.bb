SUMMARY = "Javadoc for xstream"
DESCRIPTION = "xstream API documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.21"

RPM_NAME = "xstream-javadoc-1.4.21-1.6.noarch.rpm"
RPM_HASH = "b7e45cc1e99cc2c9751d71d7f0d88f606f96e8ce29d109ab36de1befb24adaf9fc78484a84f514263e45eef5c8883aa3b15600875f7a4b3fc413f667edd994b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xstream-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
