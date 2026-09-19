SUMMARY = "API documentation for apache-commons-collections4"
DESCRIPTION = "This package provides API documentation for apache-commons-collections4."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "apache-commons-collections4-javadoc-4.5.0-1.3.noarch.rpm"
RPM_HASH = "5fa6151651403d3279a5f0e8fbf0b50d12b3ab9239d498e2a763702597139877fade9c564e1b9f724c69a8a5fac855cfcd837d922d10b94a412eabcfb3592c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
