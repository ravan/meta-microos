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

RPM_NAME = "lua53-luarocks-3.13.0-2.2.noarch.rpm"
RPM_HASH = "f884952a59110684d32752a7a0d6743a3bd3d38e978e225d0fc4fc774a11e071f8d5115f29271a27aa0462358490b3bbfa8ec9a9fa282d9a95e5a1e7305c729e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lua53-luarocks \
lua53-luarocks"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
lua53 \
lua53-compat-5.3 \
openssl \
unzip \
update-alternatives \
zip"

inherit rpm
