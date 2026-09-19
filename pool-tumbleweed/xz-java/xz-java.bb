SUMMARY = "Pure Java implementation of XZ compression"
DESCRIPTION = "This is an implementation of XZ data compression in pure Java. \
Single-threaded streamed compression and decompression and random access \
decompression have been implemented."
LICENSE = "0BSD"

PV = "1.12"

RPM_NAME = "xz-java-1.12-1.2.noarch.rpm"
RPM_HASH = "85608a14fb9b1cf546727911ad8a00f4a66969748154ef0da33b866227182a8e6e1e12cb754cc0375684dec0361d9481c18fe51d2f94e6530e10aab061de081a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-xz \
mvn-org.tukaani-xz \
mvn-org.tukaani-xz-pom- \
osgi-org.tukaani.xz \
xz-java"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
