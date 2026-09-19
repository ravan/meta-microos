SUMMARY = "Javadoc for apache-commons-pool"
DESCRIPTION = "The goal of Pool package it to create and maintain an object (instance) \
pooling package to be distributed under the ASF license. The package \
should support a variety of pool implementations, but encourage support \
of an interface that makes these implementations interchangeable. \
 \
This package contains the javadoc documentation for the Apache Commons \
Pool Package."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "apache-commons-pool-javadoc-1.6-8.10.noarch.rpm"
RPM_HASH = "1e020978ea606d03778dba0dfea4c710f7d220c671ffe88716d2d902392b1619d0b76b8fa088349d11b7f005c28066957b8b55cfdc5480aa8a95d636cbeb1116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-pool-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
