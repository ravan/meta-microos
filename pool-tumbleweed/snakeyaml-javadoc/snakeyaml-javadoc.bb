SUMMARY = "API documentation for snakeyaml"
DESCRIPTION = "This package contains API documentation for snakeyaml."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "snakeyaml-javadoc-2.2-3.9.noarch.rpm"
RPM_HASH = "ddc96f040eb88102c34baecb502baea7352ad79e7fd96b9677b8264728a65fd7f030846a9a6d60ea345ebaa8ea9a9edbc32f74353077b5f4a9e908aee29efc0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "snakeyaml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
