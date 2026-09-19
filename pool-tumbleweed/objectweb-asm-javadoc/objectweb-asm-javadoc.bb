SUMMARY = "Java bytecode manipulation framework"
DESCRIPTION = "ASM is a Java bytecode manipulation framework. \
 \
It can be used to dynamically generate stub classes or other proxy \
classes, directly in binary form, or to dynamically modify classes at \
load time, i.e., just before they are loaded into the Java Virtual \
Machine. \
 \
ASM offers similar functionalities as BCEL or SERP, but is much \
smaller."
LICENSE = "BSD-3-Clause"

PV = "9.10.1"

RPM_NAME = "objectweb-asm-javadoc-9.10.1-1.3.noarch.rpm"
RPM_HASH = "b4b294c2dbeb6b876cc64aeda44a84c257eb3b36c065105ea186c62a8642112069e42d1f1411452382d21b11c33a3b1d4b230aa9f096cf99ee900c69f8b1c664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "objectweb-asm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
