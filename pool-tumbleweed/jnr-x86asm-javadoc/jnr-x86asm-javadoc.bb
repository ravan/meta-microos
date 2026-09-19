SUMMARY = "Javadoc for jnr-x86asm"
DESCRIPTION = "Javadoc for jnr-x86asm."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "jnr-x86asm-javadoc-1.0.2-3.7.noarch.rpm"
RPM_HASH = "896ab3846db2b7727af913f0a17e0a7e078b69f499858a8b51d167f18f5d19fd4e1b135c1bde337d694ccadf0b41d8de8f2840f53fdb1d5aaecd1986426d2f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-x86asm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
