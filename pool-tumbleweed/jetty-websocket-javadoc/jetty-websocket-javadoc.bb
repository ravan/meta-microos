SUMMARY = "Javadoc for jetty-websocket"
DESCRIPTION = "Javadoc for jetty-websocket."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-websocket-javadoc-9.4.58-5.1.noarch.rpm"
RPM_HASH = "9fa53c26eadde955e3408f3877ca309282985cb2c240748c314974c75fd55746a192345a12760c3698d7a60ddd745b7fc39a7f7180b3ad55590709592bb1506d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-websocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
