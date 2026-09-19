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

RPM_NAME = "lua55-luarocks-3.13.0-2.2.noarch.rpm"
RPM_HASH = "65f24066b15b542faa6fc8df6fbc45573a1f276ce46b8dff13c87f888482730315aabc518880023def6e516059ba46c57f39ef56c01851fc345581ab31f99ca8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lua55-luarocks \
lua55-luarocks"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
lua55 \
lua55-compat-5.3 \
openssl \
unzip \
update-alternatives \
zip"

inherit rpm
