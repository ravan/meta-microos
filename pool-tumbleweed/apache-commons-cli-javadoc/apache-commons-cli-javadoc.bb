SUMMARY = "Javadoc for apache-commons-cli"
DESCRIPTION = "This package contains the API documentation for apache-commons-cli."
LICENSE = "Apache-2.0"

PV = "1.11.0"

RPM_NAME = "apache-commons-cli-javadoc-1.11.0-1.3.noarch.rpm"
RPM_HASH = "871435f5f9d9665751401f24b27aaad0e8ec89454715eb7e42ef8b465189ada1b67eb7f3ec3403ad18cb3c2579ff198612ff28af051cdefde31c22801e3da74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-cli-javadoc \
jakarta-commons-cli-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
