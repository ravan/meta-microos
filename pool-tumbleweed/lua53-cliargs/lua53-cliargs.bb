SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
cliargs allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "lua53-cliargs-3.0.2-2.2.noarch.rpm"
RPM_HASH = "db8bb2dacede31738411909a03b6a63d3ac470e66210617514761e009e6188bbe2e96eac0a08722bafcde616d3f3e2cd2d41cb04d81d6472dbde37d7641c1f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-cliargs"

RDEPENDS:${PN} += "lua53"

inherit rpm
