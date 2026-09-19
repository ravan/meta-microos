SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "libtexlua53-5-5.3.6-120.4.aarch64.rpm"
RPM_HASH = "4f7a627970845aa86d6dd7e7d9c1ea2db4c4a48a641c120eb90142b3203957fcfe3585e4a35f008f4c2ad1ee2e9f092431bf118992cd15e282cf416bce4a1527"

RPROVIDES:${PN} += "libtexlua53-5 \
libtexlua53.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
