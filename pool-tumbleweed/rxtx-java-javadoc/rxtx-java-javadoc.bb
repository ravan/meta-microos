SUMMARY = "Javadocs for rxtx-java"
DESCRIPTION = "RxTx is a Java library, using a native implementation (via JNI), providing serial \
and parallel communication for the Java Development Toolkit (JDK). It is based on \
the specification for Sun's Java Communications API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2~pre2"

RPM_NAME = "rxtx-java-javadoc-2.2~pre2-10.1.noarch.rpm"
RPM_HASH = "8e89fc5f2b52950471cab5e93e04437d1e6cfb09b440113bd13cd38cd7bb5e7a513dca6e0802630dd842b96d8898a82453e86b3a495c055b792998b611f66d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rxtx-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
