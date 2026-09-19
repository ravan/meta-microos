SUMMARY = "Java Posix layer"
DESCRIPTION = "jnr-posix is a lightweight cross-platform POSIX emulation layer for Java, \
written in Java and is part of the JNR project (http://github.com/jnr)."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "3.1.16"

RPM_NAME = "jnr-posix-3.1.16-4.4.noarch.rpm"
RPM_HASH = "22076d18fcc31561dcc00aa2b95c9b9854a105e81dc1e59ab87ffc1b67c74ac6689c33930517e760132ab48839717f2e084a807e92eef4f84b7f81a675e90c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-posix \
mvn-com.github.jnr-jnr-posix \
mvn-com.github.jnr-jnr-posix-pom- \
osgi-com.github.jnr.posix"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-ffi"

inherit rpm
