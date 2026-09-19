SUMMARY = "A Java Security Provider that implements parts of the JCE and JSSE"
DESCRIPTION = "Conscrypt is a Java Security Provider (JSP) that implements parts of the Java \
Cryptography Extension (JCE) and Java Secure Socket Extension (JSSE). It uses \
BoringSSL to provide cryptographic primitives and Transport Layer Security \
(TLS) for Java applications on Android and OpenJDK. See the capabilities \
documentation for detailed information on what is provided."
LICENSE = "Apache-2.0"

PV = "2.6.3"

RPM_NAME = "conscrypt-2.6.3-1.1.aarch64.rpm"
RPM_HASH = "95ff2634acd18d9a582e610bd96ed0dfd54d0d29b924e484f3513f80aa288373f152eac307192fb2b13bc489ebf63032872d5f24f08d1a9fbaf125dd454610dd"

RPROVIDES:${PN} += "conscrypt \
libconscrypt-jni.so \
mvn-org.conscrypt-conscrypt-openjdk \
mvn-org.conscrypt-conscrypt-openjdk-pom- \
mvn-org.conscrypt-conscrypt-openjdk-uber \
mvn-org.conscrypt-conscrypt-openjdk-uber-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1 \
libboringssl-crypto.so.1 \
libboringssl-ssl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
