SUMMARY = "API documentation for rhino"
DESCRIPTION = "API documentation for rhino."
LICENSE = "MPL-2.0"

PV = "1.7.15.1"

RPM_NAME = "rhino-javadoc-1.7.15.1-1.5.noarch.rpm"
RPM_HASH = "9f48b06f00aeee5f23eaa7471399e7c380bf49b318faadf4e9f4814332f7531e12df2c95fd2c6915e5f0dee20165c467d967d59acad13e6385f51788c679891f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rhino-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
