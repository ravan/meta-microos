SUMMARY = "Javadoc for jetty-minimal"
DESCRIPTION = "Javadoc for jetty-minimal."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-minimal-javadoc-9.4.58-5.1.noarch.rpm"
RPM_HASH = "17f17070ef9fa8f81b13c302260093e34c9434da77052480fbfcda678b0a3c438a6716705450a593b9840a15469976421e1e5a3600ceae537a7f4fabcb180390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-minimal-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
