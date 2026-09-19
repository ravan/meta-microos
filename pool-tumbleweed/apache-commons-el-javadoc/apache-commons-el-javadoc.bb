SUMMARY = "API documentation for apache-commons-el"
DESCRIPTION = "API documentation for apache-commons-el."
LICENSE = "Apache-1.1"

PV = "1.0"

RPM_NAME = "apache-commons-el-javadoc-1.0-5.8.noarch.rpm"
RPM_HASH = "dcd6b54ae2a5c7bc2da62e1b645266e809eea99919363c188d06a850655117c538a0b45964f64d619448a81fd5482fd6ccae65338aaac3ef17359efca2919c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-el-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
