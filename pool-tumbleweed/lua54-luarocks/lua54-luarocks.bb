SUMMARY = "A deployment and management system for Lua modules"
DESCRIPTION = "LuaRocks allows you to install Lua modules as self-contained packages \
called 'rocks', which also contain version dependency \
information. This information is used both during installation, so \
that when one rock is requested all rocks it depends on are installed \
as well, and at run time, so that when a module is required, the \
correct version is loaded. LuaRocks supports both local and remote \
repositories, and multiple local rocks trees."
LICENSE = "MIT"

PV = "3.13.0"

RPM_NAME = "lua54-luarocks-3.13.0-2.2.noarch.rpm"
RPM_HASH = "4f2c0f036c93954322348398f0d0afd66d0e3f6faa0838232e5b8f2b38b2645bc384f250d2492c5ae5b98347c6b4bfe5b7ec9c9872c9244b4c075f3fad3ab27c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lua54-luarocks \
lua-luarocks \
lua54-luarocks"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
lua54 \
lua54-compat-5.3 \
openssl \
unzip \
update-alternatives \
zip"

inherit rpm
