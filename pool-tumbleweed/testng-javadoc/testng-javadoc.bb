SUMMARY = "API documentation for testng"
DESCRIPTION = "This package contains the API documentation for testng."
LICENSE = "Apache-2.0"

PV = "7.10.2"

RPM_NAME = "testng-javadoc-7.10.2-1.8.noarch.rpm"
RPM_HASH = "d31120c1a0e6f29e92ea3eb136a802ad4267d1e60e659882f1f116eaf06040aea7becfdf44e81f062780f96cf68bcd9ad5637942a59c807752603ce128e38181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "testng-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
