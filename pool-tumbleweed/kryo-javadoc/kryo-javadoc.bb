SUMMARY = "Javadoc for kryo"
DESCRIPTION = "This package contains javadoc for kryo."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "4.0.2"

RPM_NAME = "kryo-javadoc-4.0.2-4.7.noarch.rpm"
RPM_HASH = "bf50abb8e1f826cba6d1e5b9dd6ead5a1612567b73822551de907a98a46a371deeaee4662a625b9ef87d994f497dbffb1fb523e67394a47d055f50d2554c74a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kryo-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
