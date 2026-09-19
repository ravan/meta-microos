SUMMARY = "Type arithmetic library for Java5"
DESCRIPTION = "This library provides functions that perform type arithemtic over the \
type system of Java5. For example, one can compute that List<String> \
is a sub-type of Collection<String> but not Collection<Object>, you \
can compute the erasure of java.lang.reflect.Type, or you can \
determine the array component type T from A[T]."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.2"

RPM_NAME = "tiger-types-2.2-5.10.noarch.rpm"
RPM_HASH = "187a189532c321fdd7890365e6c595d3f19da6ee6e4ef631607e3656232ecdb8d647848054f0a81a98dfec5341ad46e96a9f929db911583c2b73d7c7d4771c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jvnet-tiger-types \
mvn-org.jvnet-tiger-types-pom- \
osgi-org.jvnet.tiger-types \
tiger-types"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
