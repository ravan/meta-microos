SUMMARY = "Javadoc for glassfish-transaction-api"
DESCRIPTION = "This package contains javadoc for glassfish-transaction-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3"

RPM_NAME = "glassfish-transaction-api-javadoc-1.3-7.3.noarch.rpm"
RPM_HASH = "213adc257024198bc486a341a2349364c9f4cbd7ad12076304d9265d381210f93efb0d72c5f9de9baf34211d18af24c291133c0bba1a3ca56382cd0f2c134de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-transaction-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
