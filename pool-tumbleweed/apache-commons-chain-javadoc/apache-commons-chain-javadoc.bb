SUMMARY = "Javadoc for apache-commons-chain"
DESCRIPTION = "This package contains javadoc for apache-commons-chain."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "apache-commons-chain-javadoc-1.2-3.9.noarch.rpm"
RPM_HASH = "944c10fbd7b2296784a43ec5e94316487f0b41b49de5c9257eaf83674f84683a675bf0921ffe95350d7a564771d5c0b1a79ea2d1092c16a320c71bcf1744a6ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-chain-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
