SUMMARY = "Lua string hashing library, useful for internationalization"
DESCRIPTION = "Useful for internationalization."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "luajit-say-1.4.1-3.2.noarch.rpm"
RPM_HASH = "2ae591e33e3cf51e31131d21b8fa4708703d360097e6c93236fcd0ca7d5ae554b062c7563913d0a46c7ca2348544240cf6b9b5ad9e582b8673ac2a1c08b2b6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-say"

RDEPENDS:${PN} += "luajit"

inherit rpm
