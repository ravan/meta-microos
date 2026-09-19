SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
cliargs allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "lua54-cliargs-3.0.2-2.2.noarch.rpm"
RPM_HASH = "8f8c51d1e79f7db00fcac156a95dc2be48426437b14ad42cd166a3ed2a62e45b0dedec7c600f6018ce2cab3dad732a86db574f43a43c4a4a8154d58db6660452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luacliargs \
lua54-cliargs"

RDEPENDS:${PN} += "lua54"

inherit rpm
