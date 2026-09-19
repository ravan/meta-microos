SUMMARY = "Javadoc for plexus-interpolation"
DESCRIPTION = "API documentation for plexus-interpolation."
LICENSE = "Apache-1.1 & Apache-2.0 & MIT"

PV = "1.28"

RPM_NAME = "plexus-interpolation-javadoc-1.28-1.6.noarch.rpm"
RPM_HASH = "05b048a3c76b176c38ccfaff5d3fa4646159b59622e35ae04acc8a01a254cc993eacd7ddd4d272cc4ebb156e94a085f624b0bb5212e1eec06ae08fd235e50a05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-interpolation-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
