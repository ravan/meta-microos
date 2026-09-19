SUMMARY = "High performance Java library that provides reflection by using code generation"
DESCRIPTION = "ReflectASM is a very small Java library that provides \
high performance reflection by using code generation. \
An access class is generated to set/get fields, \
call methods, or create a new instance. The access class \
uses byte-code rather than Java's reflection, so it \
is much faster. It can also access primitive fields \
via byte-code to avoid boxing."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "reflectasm-1.11.1-2.10.noarch.rpm"
RPM_HASH = "c2b110dd7a730e2242c7c014a80dc9db86ba485835f9d32b2604f3b5a28c1ec61f749f27b8e60f17fe1cb423e6f8d41fc6a0bf8335f8f2e10e1152967c63b277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.esotericsoftware-reflectasm \
mvn-com.esotericsoftware-reflectasm-pom- \
mvn-com.esotericsoftware.reflectasm-reflectasm \
mvn-com.esotericsoftware.reflectasm-reflectasm-pom- \
osgi-com.esotericsoftware.reflectasm \
reflectasm"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm"

inherit rpm
