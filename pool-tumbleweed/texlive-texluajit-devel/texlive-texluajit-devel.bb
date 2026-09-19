SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "This package includes the LuaJIT development files. \
LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.81742"

RPM_NAME = "texlive-texluajit-devel-2.1.81742-120.4.aarch64.rpm"
RPM_HASH = "d6eccb1764cfbd53574f17bfa88ef5a0d43eccabd3ffa311a437d057e0a3864aa53c71860daed655bc15fb9707c927bb835b5a36dd08a72adb868746862f8aa5"

RPROVIDES:${PN} += "pkgconfig-texluajit \
texlive-texluajit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtexlua53-5 \
libtexluajit2"

inherit rpm
