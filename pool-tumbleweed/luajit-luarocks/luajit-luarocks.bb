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

RPM_NAME = "luajit-luarocks-3.13.0-2.2.noarch.rpm"
RPM_HASH = "b8e9987a4b780c21b8235069bd3ff385b6e3cf96b34622ab13e895879dabf30a48fe6b8dab58ceb97be5e5e6fb7cae8f5d84e0a379a54eeaa53725e6f063c1e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-luajit-luarocks \
luajit-luarocks"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
luajit \
luajit-compat-5.3 \
openssl \
unzip \
update-alternatives \
zip"

inherit rpm
