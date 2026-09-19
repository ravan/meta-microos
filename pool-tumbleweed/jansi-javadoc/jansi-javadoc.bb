SUMMARY = "Javadocs for jansi"
DESCRIPTION = "This package contains the API documentation for jansi."
LICENSE = "Apache-2.0"

PV = "2.4.3"

RPM_NAME = "jansi-javadoc-2.4.3-2.3.noarch.rpm"
RPM_HASH = "2210a0956e0fb2962932b2a8a8a5e9bd0bd5aa94d6e135be9aa58dca0ccadbfa0f74bb6eaef864770402a7bf4848e44a49dc40f4a220fac66112c55d3fec532b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jansi-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
