SUMMARY = "Jakarta Annotations"
DESCRIPTION = "Jakarta Annotations defines a collection of annotations representing \
common semantic concepts that enable a declarative style of programming \
that applies across a variety of Java technologies."
LICENSE = "EPL-2.0 | GPL-2.0-with-classpath-exception"

PV = "3.0.0"

RPM_NAME = "jakarta-annotations-3.0.0-1.6.noarch.rpm"
RPM_HASH = "87d8f6e357c24a431abf5405b36c083756a94baad7df4f5349253b4fa67b2057f43bf529963d846bac8be611f87fa13031c5e1527f1162298532aca33de52daf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-annotations \
mvn-jakarta.annotation-jakarta.annotation-api \
mvn-jakarta.annotation-jakarta.annotation-api-pom- \
osgi-jakarta.annotation-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
