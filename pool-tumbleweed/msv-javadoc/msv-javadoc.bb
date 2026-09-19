SUMMARY = "API documentation for Multi-Schema Validator"
DESCRIPTION = "API documentation for Multi-Schema Validator."
LICENSE = "Apache-1.1 & BSD-3-Clause & Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "2013.6.1"

RPM_NAME = "msv-javadoc-2013.6.1-7.2.noarch.rpm"
RPM_HASH = "bc7c74dbce66152bf065fb7d9c206139dbaa0cc0f68b8cf52fde6c56d4c5dd7c3c27ca8fd1b0e0b59b95da06b7118a32cc2697dc55de8d756af6374be10c39ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
