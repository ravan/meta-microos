SUMMARY = "Process application arguments the same way as getopt_long"
DESCRIPTION = "alt-getopt is a module for Lua programming language for \
processing application's arguments the same way BSD/GNU \
getopt_long(3) functions do.  The main goal is compatibility \
with SUS 'Utility Syntax Guidelines' guidelines 3-13."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "lua53-alt-getopt-0.8.1-6.3.noarch.rpm"
RPM_HASH = "d5021873af73ed9acac7de624b93f53de89b1f94b1e5b7162ab028562a02ecf13310ec1f02100c05a357521230f30f788659e99eb7e7c69b8823d3ecd9a7d9c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-alt-getopt"

RDEPENDS:${PN} += "lua53"

inherit rpm
