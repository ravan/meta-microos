SUMMARY = "Ant task for proguard"
DESCRIPTION = "Ant task for proguard"
LICENSE = "GPL-2.0-or-later"

PV = "6.2.0"

RPM_NAME = "ant-proguard-6.2.0-1.30.noarch.rpm"
RPM_HASH = "9b948682d3d000b780f55328f4853b212111825db6c7939b240e9cc35e0b9687d5b903e43028f1c1d931bb542bd4d3ab97b21452a934b250a5adbc3dd67e59ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-proguard \
config-ant-proguard \
mvn-net.sf.proguard-proguard-anttask \
mvn-net.sf.proguard-proguard-anttask-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.sf.proguard-proguard-base"

inherit rpm
