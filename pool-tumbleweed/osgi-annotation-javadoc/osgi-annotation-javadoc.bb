SUMMARY = "API documentation for osgi-annotation"
DESCRIPTION = "This package contains the API documentation for osgi-annotation."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "osgi-annotation-javadoc-8.1.0-2.8.noarch.rpm"
RPM_HASH = "5294c20ff5bac92a2e57bdd19b6d2de17c47508fb22bdce98dd4e06b25f227a2d099cb2e6c89bf78e9465ebe59515171fb27e94c3bb286dfeca47e4bfe9e355d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-annotation-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
