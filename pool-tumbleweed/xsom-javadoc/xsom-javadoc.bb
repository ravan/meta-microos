SUMMARY = "Javadoc for xsom"
DESCRIPTION = "This package contains javadoc for xsom."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "0~20140925"

RPM_NAME = "xsom-javadoc-0~20140925-6.6.noarch.rpm"
RPM_HASH = "1e5a310db41e887aea5d1c7eb245d4e46e89bdcf890136669088133df6f2a97ea41eae9c9abfa2e0e71b726d02fa06f4c6e519ed4636c95cd231dca1466e613f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xsom-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
