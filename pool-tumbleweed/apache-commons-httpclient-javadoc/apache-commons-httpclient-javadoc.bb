SUMMARY = "Developer documentation for apache-commons-httpclient"
DESCRIPTION = "Developer documentation for apache-commons-httpclient in JavaDoc \
format. \
 \
Developer documentation for apache-commons-httpclient."
LICENSE = "Apache-2.0"

PV = "3.1"

RPM_NAME = "apache-commons-httpclient-javadoc-3.1-15.9.noarch.rpm"
RPM_HASH = "6e92eb03b93574940f33a2a8aabcc7750aab092fd18fd82fc718d4bd9c0aee34cd04a1c9a54f760b796601a50a02e59e32eaa5742f6d41ec399e1a98caea200a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-httpclient-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
