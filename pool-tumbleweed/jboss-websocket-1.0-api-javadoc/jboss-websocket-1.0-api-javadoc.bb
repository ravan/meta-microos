SUMMARY = "Javadocs for jboss-websocket-1.0-api"
DESCRIPTION = "This package contains the API documentation for jboss-websocket-1.0-api."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.0"

RPM_NAME = "jboss-websocket-1.0-api-javadoc-1.0.0-4.10.noarch.rpm"
RPM_HASH = "ce26742a800b4837258804c32fbccdd67a0b25c1990d76aba851024f467724d01dacb7a0c3a311f3c03208be24c22c5cdc33195f7896f6b21c56610547f942db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-websocket-1.0-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
