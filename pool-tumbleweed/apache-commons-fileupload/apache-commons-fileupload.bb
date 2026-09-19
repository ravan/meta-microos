SUMMARY = "API to work with HTML file upload"
DESCRIPTION = "The javax.servlet package lacks support for RFC-1867, HTML file \
upload.  This package provides a simple to use API for working with \
such data.  The scope of this package is to create a package of Java \
utility classes to read multipart/form-data within a \
javax.servlet.http.HttpServletRequest."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "apache-commons-fileupload-1.6.0-1.7.noarch.rpm"
RPM_HASH = "b646283f1848c069bc623d55f8a7888fe14ca33b9cf3a0cd2f6fdb4ff5ee56fe5425fb86e59ca719fa7752e2b76cf8609d3600c5d3e9d1344b38050f4811b32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-fileupload \
commons-fileupload \
jakarta-commons-fileupload \
mvn-commons-fileupload-commons-fileupload \
mvn-commons-fileupload-commons-fileupload-pom- \
mvn-org.apache.commons-commons-fileupload \
mvn-org.apache.commons-commons-fileupload-pom- \
osgi-org.apache.commons.fileupload"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io"

inherit rpm
