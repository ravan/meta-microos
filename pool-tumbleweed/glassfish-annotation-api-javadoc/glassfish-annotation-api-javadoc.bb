SUMMARY = "Javadoc for glassfish-annotation-api"
DESCRIPTION = "This package contains javadoc for glassfish-annotation-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3.2"

RPM_NAME = "glassfish-annotation-api-javadoc-1.3.2-4.8.noarch.rpm"
RPM_HASH = "744e66561e8c52ea82dc0474b1b147e2cf3baa6fae2a8504ed4761d1d12b2c98f94adc7bccb5d54d6b56400bcc75bf74023ad5f6bcf40ca2eea3d6beec1a9d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-annotation-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
