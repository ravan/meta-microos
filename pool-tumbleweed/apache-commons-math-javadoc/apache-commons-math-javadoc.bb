SUMMARY = "Javadoc for apache-commons-math"
DESCRIPTION = "This package contains the API documentation for apache-commons-math."
LICENSE = "Apache-2.0"

PV = "3.6.1"

RPM_NAME = "apache-commons-math-javadoc-3.6.1-9.7.noarch.rpm"
RPM_HASH = "a0987204596edd09eec927fd64f9bea27b5ea93594ca6753ec0de8d30123161792594171fdcd7df68a7de3388e4fc4ee0593ebbcea37101c7a390080e51f690c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-math-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
