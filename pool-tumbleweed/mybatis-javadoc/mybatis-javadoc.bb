SUMMARY = "Javadoc for mybatis"
DESCRIPTION = "This package contains javadoc for mybatis."
LICENSE = "Apache-2.0"

PV = "3.5.19"

RPM_NAME = "mybatis-javadoc-3.5.19-2.5.noarch.rpm"
RPM_HASH = "458793167dd961487d48cd980422f267a7b161f1df3c4760aa6884bd1c33b12b6f64984ca5ddef58a52056a7079eb76fca4d30415ddb66a02235eb9de92bf272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mybatis-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
