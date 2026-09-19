SUMMARY = "API documentation for jakarta-websocket"
DESCRIPTION = "API documentation for jakarta-websocket."
LICENSE = "EPL-2.0 | GPL-2.0-with-Classpath-Exception"

PV = "2.2.0"

RPM_NAME = "jakarta-websocket-javadoc-2.2.0-3.4.noarch.rpm"
RPM_HASH = "b1c7539164190c6bcff8614c5d3242b8e0e84ca1c82f518f03b58befc82fdf6d2286feb49e8205cb380c1e1f437adc7f5aedb60efca9be6e0749a44aaa2295ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-websocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
