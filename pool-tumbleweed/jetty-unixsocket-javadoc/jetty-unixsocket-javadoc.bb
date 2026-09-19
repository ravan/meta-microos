SUMMARY = "Javadoc for jetty-unixsocket"
DESCRIPTION = "Javadoc for jetty-unixsocket."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-unixsocket-javadoc-9.4.58-5.1.noarch.rpm"
RPM_HASH = "e880e294257ecfe5455bedf95ab88427fa88ee1be79787cc7ab42c525159b53e62c79017f6cc0afaa7170a50a4b41c4378b598dcd7cf922c534fcf2ea4acf286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-unixsocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
