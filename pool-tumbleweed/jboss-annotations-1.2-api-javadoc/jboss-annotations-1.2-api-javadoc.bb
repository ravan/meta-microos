SUMMARY = "Javadoc for jboss-annotations-1.2-api"
DESCRIPTION = "This package contains javadoc for jboss-annotations-1.2-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.2"

RPM_NAME = "jboss-annotations-1.2-api-javadoc-1.0.2-3.8.noarch.rpm"
RPM_HASH = "de05bf821c70100e06dd2fcc4c5ab5742f5c7ad2e73b08ee0eb1377d14a8798a94efb8b4c63092f208f1d6732c0a0bae3b45f110560c8c0dd8830eeda010e943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-annotations-1.2-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
