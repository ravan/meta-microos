SUMMARY = "JDBC DataSources/Resource Pools"
DESCRIPTION = "c3p0 is a library for augmenting traditional (DriverManager-based) \
JDBC drivers with JNDI-bindable DataSources, including DataSources \
that implement Connection and Statement Pooling, as described by the \
jdbc3 spec and jdbc2 standard extension."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "c3p0-0.14.1-1.2.noarch.rpm"
RPM_HASH = "19e753650bb23cdd97866eb68188819a576cd6a2bee851b7be8c2333ae0d839bc8831bc1ce02484beccaf56c8f24d6949c60b442ce6d04d6b0da7db967bbb0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "c3p0 \
mvn-c3p0-c3p0 \
mvn-c3p0-c3p0-pom- \
mvn-com.mchange-c3p0 \
mvn-com.mchange-c3p0-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.mchange-mchange-commons-java"

inherit rpm
