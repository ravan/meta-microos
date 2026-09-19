SUMMARY = "Header files for lua53-lua-ev"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua53-lua-ev."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua53-lua-ev-devel-1.5-7.3.noarch.rpm"
RPM_HASH = "8289186ebf724eccfe920372d7c4ee3a54d073b38c5f4be5475fdb4baf61d9f14c7d51b79b1fc451de6f1aa300002e435ff784db67a131e2c06c4c70dc56e494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-lua-ev-devel"

RDEPENDS:${PN} += "lua53-lua-ev"

inherit rpm
