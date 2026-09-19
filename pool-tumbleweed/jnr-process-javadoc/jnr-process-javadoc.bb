SUMMARY = "Javadocs for jnr-process"
DESCRIPTION = "This package contains the API documentation for jnr-process."
LICENSE = "Apache-2.0"

PV = "0.4.12"

RPM_NAME = "jnr-process-javadoc-0.4.12-3.3.noarch.rpm"
RPM_HASH = "5b5e43104c9896585eeb27cf2a400c6564364d1faf8b221c6b3119b6172dccac9287f2b39bd2403fba945e2408bf3f08112504de51dc0a9488dc69058ba3cf15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-process-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
