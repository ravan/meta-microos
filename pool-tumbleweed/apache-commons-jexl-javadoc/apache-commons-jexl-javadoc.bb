SUMMARY = "Javadocs for apache-commons-jexl"
DESCRIPTION = "This package contains the API documentation for apache-commons-jexl."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "apache-commons-jexl-javadoc-2.1.1-4.8.noarch.rpm"
RPM_HASH = "2ab9a91854ce18376187f60c5541665260e319d32d935776cb011e8e35760bf81090f68e26c9c8f694a87326e89bd8e2ec828c4c75800a7584646adee7367c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jexl-javadoc \
commons-jexl-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
