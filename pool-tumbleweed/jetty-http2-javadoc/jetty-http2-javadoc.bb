SUMMARY = "Javadoc for jetty-http2"
DESCRIPTION = "Javadoc for jetty-http2."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-http2-javadoc-9.4.58-5.1.noarch.rpm"
RPM_HASH = "e5cb54afa96ee4949738cee29400bd2397e6cece46a33b891be788492d6dce70b4ec6fddf408bf9ecba01b4805fa76697066d4773155428f9bcd2c04b2d6e87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
