SUMMARY = "Javadoc for plexus-utils"
DESCRIPTION = "Javadoc for plexus-utils."
LICENSE = "Apache-1.1 & Apache-2.0 & xpp & BSD-3-Clause & LicenseRef-SUSE-Public-Domain"

PV = "4.1.0"

RPM_NAME = "plexus-utils-javadoc-4.1.0-1.1.noarch.rpm"
RPM_HASH = "0d92a68c4d03027d6372cd01e824ca2f319d2d89872cfaad5b1dd797bddc909b6df163a87f06c8e2cda3239fff4ab09ef4fc5f99a8104643944356dc732733da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-utils-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
