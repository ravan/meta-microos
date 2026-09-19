SUMMARY = "Pure java x86 and x86_64 assembler"
DESCRIPTION = "This is a pure-java port of asmjit (http://code.google.com/p/asmjit/)."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "jnr-x86asm-1.0.2-3.7.noarch.rpm"
RPM_HASH = "cb1ab30058d5575286dc3306cfb6efb10799d76574a456634d041144d692774696e87bb6123922ee3fd6da004e132bddcc748934ee4bf61eb58d6511a859be0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-x86asm \
mvn-com.github.jnr-jnr-x86asm \
mvn-com.github.jnr-jnr-x86asm-pom- \
osgi-jnr.x86asm"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
