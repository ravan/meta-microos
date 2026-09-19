SUMMARY = "Object-Graph Navigation Language"
DESCRIPTION = "OGNL stands for Object-Graph Navigation Language; it is an \
expression language for getting and setting properties of Java \
objects. You use the same expression for both getting and setting \
the value of a property."
LICENSE = "Apache-2.0"

PV = "3.4.7"

RPM_NAME = "ognl-3.4.7-2.1.noarch.rpm"
RPM_HASH = "e74c1a37c59d582ca4691f1c91bd5843e65a014e79d12611d4eeb1a4f57402abb36abf8901c6d64679847bf85f9ddabfa11573b7b2043d32d9627155639ac546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-ognl-ognl \
mvn-ognl-ognl-pom- \
ognl"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.javassist-javassist"

inherit rpm
