SUMMARY = "Javadoc for sac"
DESCRIPTION = "Javadoc for sac."
LICENSE = "W3C"

PV = "1.3"

RPM_NAME = "sac-javadoc-1.3-15.6.noarch.rpm"
RPM_HASH = "91a1172cd4389baf2d4d147f6a89ff9cb5374e933e4c3780fca446452df4fbe1451edfaba7ce84f0f17ad10a1bb0a45cb8c856eb96bbf1d72eae3ec405523dd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sac-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
