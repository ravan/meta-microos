SUMMARY = "API documentation for apache-commons-jxpath"
DESCRIPTION = "This package contains the API documentation for apache-commons-jxpath."
LICENSE = "Apache-2.0"

PV = "1.3"

RPM_NAME = "apache-commons-jxpath-javadoc-1.3-11.8.noarch.rpm"
RPM_HASH = "1c37b6cf6343d6e0f0da20f832e7fb99d1ec0933a26bfeaed8b857ce34c9bb9b1a318db16fea87b0054d50898329e370da702b8c52022dec8ccfe8d790efd37b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jxpath-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
