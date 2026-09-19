SUMMARY = "Command-line argument parsing module for Lua"
DESCRIPTION = "This module adds support for accepting CLI arguments easily using multiple \
notations and argument types. \
 \
cliargs allows you to define required, optional, and flag arguments."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "luajit-cliargs-3.0.2-2.2.noarch.rpm"
RPM_HASH = "193995c9c1448013cc2af02e3068bf170ebe14b93f0c30709890e24566d17c5f9b571f2ded2d89531e0fe2adc623925af50cb87be9c58e3fba818458e8dfe724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-cliargs"

RDEPENDS:${PN} += "luajit"

inherit rpm
