SUMMARY = "Header files for lua54-lua-ev"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua54-lua-ev."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua54-lua-ev-devel-1.5-7.3.noarch.rpm"
RPM_HASH = "11d26513b3fa6baba56a348a67ff15dd9eb55d6d77b815efdacd1ad4ab54ceded601f32b8b1ead4abedfd5b607bf92ceccb93b276d39aa78c75bb5278ac7e02f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua54-lua-ev-devel"

RDEPENDS:${PN} += "lua54-lua-ev"

inherit rpm
