SUMMARY = "Header files for lua55-lua-ev"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua55-lua-ev."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua55-lua-ev-devel-1.5-7.3.noarch.rpm"
RPM_HASH = "26696a1ea133ab096565a877feb1a2cac9c543ad6cc10474021a683da7288c184d2fab1a49a7f433521c8ddd8d6b5dbca452ca1409f3892983529a239d97f8a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-lua-ev-devel"

RDEPENDS:${PN} += "lua55-lua-ev"

inherit rpm
