SUMMARY = "Javadoc for HPPC"
DESCRIPTION = "This package contains javadoc for HPPC."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "hppc-javadoc-0.7.1-7.10.noarch.rpm"
RPM_HASH = "43e0277dcb2ca9a79fb8e847ebe33e30e115d9626c52bd232217377efe3a14684fcc37f29b9e6f08b560710134bc52cbd859d833c09b79ba3f602066b5298b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hppc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
