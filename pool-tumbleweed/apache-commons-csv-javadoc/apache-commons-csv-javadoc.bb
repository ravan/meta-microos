SUMMARY = "API documentation for apache-commons-csv"
DESCRIPTION = "This package contains the API documentation for apache-commons-csv."
LICENSE = "Apache-2.0"

PV = "1.14.1"

RPM_NAME = "apache-commons-csv-javadoc-1.14.1-2.2.noarch.rpm"
RPM_HASH = "0bb18e86cb84789da269be7635fea92af689b9fde2fc22f465ec0ac784875fd800ee35966eebf66c15b5309befef5b257096b87c79d238ee85c90d4625c4da8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-csv-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
