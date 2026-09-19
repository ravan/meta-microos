SUMMARY = "Javadocs for jnr-constants"
DESCRIPTION = "This package contains the API documentation for jnr-constants."
LICENSE = "Apache-2.0"

PV = "0.10.4"

RPM_NAME = "jnr-constants-javadoc-0.10.4-2.10.noarch.rpm"
RPM_HASH = "bf54e16ddf4adf6703e68e8ac3c517f1bb374cd65878422333433937b0531c3e9bf4dcc27c68b956e862328d03acd0a097defa22a182ff88eb44b5eea61c0a74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-constants-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
