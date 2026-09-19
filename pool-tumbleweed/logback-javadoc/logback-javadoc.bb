SUMMARY = "Javadoc for logback"
DESCRIPTION = "API documentation for the Logback library"
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "logback-javadoc-1.6.0-1.1.noarch.rpm"
RPM_HASH = "9ff2c5bd6da3fc1ea70cd6139908d6d7e986451a499d529b8ff7e4ca00b0df2edc00a665ca16e4b64e64cb6810a3d1510391e639ec60b37d7df4be23fcfca116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
