SUMMARY = "Javadoc for apache-commons-email"
DESCRIPTION = "This package contains the API documentation for apache-commons-email."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "apache-commons-email-javadoc-1.6.0-1.3.noarch.rpm"
RPM_HASH = "a6d16b8a3c8944ff155328680da74a4047378b48c29862fbc773dff59d45fe05b40834a428ef6081b3a04ce64e0bde7723160fe817a0a2fb5b493058935245c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-email-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
