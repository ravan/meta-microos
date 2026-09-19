SUMMARY = "Concurrent Programming Framework"
DESCRIPTION = "A High Performance Inter-Thread Messaging Library."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "disruptor-3.4.4-2.10.noarch.rpm"
RPM_HASH = "8ee6957d69c6b2824068f9ab553abf75896dd9d889cbfd76f9f6efe86a332aade3824238a46194d9e70e51b33df52d21eb73b6c3dbed2784ad7ed9931624fd0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "disruptor \
mvn-com.lmax-disruptor \
mvn-com.lmax-disruptor-pom- \
osgi-com.lmax.disruptor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
