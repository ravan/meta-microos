SUMMARY = "Java online banking client using the HBCI standard"
DESCRIPTION = "Fork of HBCI4Java that contains support for chipTAN, \
smsTAN, HHD, SEPA and other fixes/enhancements."
LICENSE = "LGPL-2.1-only"

PV = "3.1.79"

RPM_NAME = "hbci4java-3.1.79-2.2.aarch64.rpm"
RPM_HASH = "c1e861ee5a92f92a44f3a00994a3e6201554b22cb3b94b2a1afeba19b2540d01692067062a3b8bc5cbb9dcb260606bd82af983cfe82c6c413ae4f4ea39ce6916"

RPROVIDES:${PN} += "hbci4java \
libhbci4java-card-linux.so \
mvn-com.github.hbci4j-hbci4j-core \
mvn-com.github.hbci4j-hbci4j-core-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
libc.so.6 \
libstdc++.so.6 \
mvn-javax.xml.bind-jaxb-api \
mvn-org.glassfish.jaxb-jaxb-runtime"

inherit rpm
