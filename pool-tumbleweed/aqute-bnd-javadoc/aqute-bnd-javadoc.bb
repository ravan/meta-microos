SUMMARY = "Javadoc for aqute-bnd"
DESCRIPTION = "API documentation for aqute-bnd."
LICENSE = "Apache-2.0"

PV = "6.4.1"

RPM_NAME = "aqute-bnd-javadoc-6.4.1-7.1.noarch.rpm"
RPM_HASH = "97e7239b2dcedddb65b6569d8a20172935a99d0d363d068da4e5b209605a3de4d2fa250ee2b03e3e39a15f49448151b965f609907e41b38acdf182cb7aa48b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aqute-bnd-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
