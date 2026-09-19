SUMMARY = "Javadoc for relaxngcc"
DESCRIPTION = "This package contains javadoc for relaxngcc."
LICENSE = "Apache-1.1"

PV = "1.12"

RPM_NAME = "relaxngcc-javadoc-1.12-3.13.noarch.rpm"
RPM_HASH = "faab7140c20c7671e9630a1c4f541d5e883266c2c52c51be79f60cb1525660458f24daa8ab17f648f7385523330b59d58599bc07081c5c70b98e758723a1a6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "relaxngcc-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
