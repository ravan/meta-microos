SUMMARY = "Process application arguments the same way as getopt_long"
DESCRIPTION = "alt-getopt is a module for Lua programming language for \
processing application's arguments the same way BSD/GNU \
getopt_long(3) functions do.  The main goal is compatibility \
with SUS 'Utility Syntax Guidelines' guidelines 3-13."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "lua54-alt-getopt-0.8.1-6.3.noarch.rpm"
RPM_HASH = "2fc5c9fb18bc32ef0c0f03d6663c57a8d4e711fb6d88d23ab5d54d4fcdf71abecea8ae8099d75fd4788e46d10cafd91391448b415a32b5857fe1b35b7fe918de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-alt-getopt \
lua54-alt-getopt"

RDEPENDS:${PN} += "lua54"

inherit rpm
