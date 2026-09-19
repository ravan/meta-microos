SUMMARY = "Javadoc for plexus-io"
DESCRIPTION = "API documentation for plexus-io."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "plexus-io-javadoc-3.6.0-1.3.noarch.rpm"
RPM_HASH = "7572f0d96ff0e81b7a8cb781b5e7229418aad0dc64f8b679be3dc6ab91ad6e4b1e759b1b3b19d6d9e0b68d06b6894b887e2abf3fda8e9cb77a3b0ced1998dd69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-io-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
