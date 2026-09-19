SUMMARY = "API documentation for aopalliance"
DESCRIPTION = "This package contains the API documentation for aopalliance."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "1.0"

RPM_NAME = "aopalliance-javadoc-1.0-5.3.noarch.rpm"
RPM_HASH = "25e119d9de91eba4924ea4c04701adf41a706f664c480da05d1592239d462c0263815f822a994666324e4c5224404f16dc4ef7f1c6e4a3ff877a339be9ad223d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aopalliance-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
