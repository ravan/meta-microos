SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "This package includes the luatex development files. \
LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "texlive-texlua-devel-5.3.6-120.4.aarch64.rpm"
RPM_HASH = "cb40f54dcc0a79b5f24a0254bc0bb8bb279b94311a74c18845bcd4c59e8706f59b6667be9fed78b0bf3fddeba4a56de16f5d4c4c0c4b652a9a52512103621bd5"

RPROVIDES:${PN} += "pkgconfig-texlua53 \
texlive-texlua-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtexlua53-5"

inherit rpm
