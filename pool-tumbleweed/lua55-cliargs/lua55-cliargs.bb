SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
cliargs allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "lua55-cliargs-3.0.2-2.2.noarch.rpm"
RPM_HASH = "87c6ff3fa78df67940b01347c18ccf987c28a8babc2ba7899292cd06332746003ec6704366b5c8c95ef11c7b423c3d4a3515382cd32224ddf2f9da8f34498621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-cliargs"

RDEPENDS:${PN} += "lua55"

inherit rpm
