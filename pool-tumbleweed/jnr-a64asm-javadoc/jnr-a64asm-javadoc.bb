SUMMARY = "Javadocs for jnr-a64asm"
DESCRIPTION = "This package contains the API documentation for jnr-a64asm."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jnr-a64asm-javadoc-1.0.0-4.10.noarch.rpm"
RPM_HASH = "ebd7791fcf50f72cba8a06cc87a335e2741b2b1228c010b7ac6652851dd4e321f4b87d12fedf5da6c0199a6681d01b2a66a05251475e8e38b739a57e638e4b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-a64asm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
