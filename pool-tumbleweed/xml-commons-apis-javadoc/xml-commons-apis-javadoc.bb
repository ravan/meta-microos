SUMMARY = "Javadoc for xml-commons-apis"
DESCRIPTION = "Javadoc for xml-commons-apis."
LICENSE = "Apache-2.0 & W3C & LicenseRef-SUSE-Public-Domain"

PV = "1.4.01"

RPM_NAME = "xml-commons-apis-javadoc-1.4.01-7.3.noarch.rpm"
RPM_HASH = "09b925ca45e844a33c303ad41eb94bf22ea514294f4802a741ae615083f80968ae3019dc04ff9605837c7cf75e0cb12ab440a15f8483be8082cb59f38cf0b817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-commons-apis-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
