SUMMARY = "Javadoc for apache-commons-lang3"
DESCRIPTION = "Javadoc for apache-commons-lang3."
LICENSE = "Apache-2.0"

PV = "3.20.0"

RPM_NAME = "apache-commons-lang3-javadoc-3.20.0-1.3.noarch.rpm"
RPM_HASH = "250baf3548e8fc4c35a4e4941c3fe0a6cfd29181c8744336959150174efa321d98aa36abadedbb20e6cfb1310719c0f11c0048504749c60bf3405a81984ddbc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
