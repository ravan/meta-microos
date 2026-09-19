SUMMARY = "API documentation for apache-commons-digester3"
DESCRIPTION = "This package provides API documentation for apache-commons-digester3."
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "apache-commons-digester3-javadoc-3.2-3.3.noarch.rpm"
RPM_HASH = "b0b1b9537e7cf1f41f26760495c8063e8c3be8f290da2f399617ce7729f350ceb42b291e9bc466c20ce82771c24290190a22a26481e8b71e2b4082224d61eeb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-digester3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
