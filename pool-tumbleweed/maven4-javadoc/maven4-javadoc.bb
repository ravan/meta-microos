SUMMARY = "API documentation for maven4"
DESCRIPTION = "API documentation for maven4."
LICENSE = "Apache-2.0 & MIT"

PV = "4.0.0~rc6"

RPM_NAME = "maven4-javadoc-4.0.0~rc6-2.1.noarch.rpm"
RPM_HASH = "57c041c82d694255c8b647028ef0f98ff8d321dc081c708dcbdda0fb58624dc6f3e93256109c9797c3a4dec1a8bc83ed5db4313a1d54bb7cdbf37dc15577bd0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
