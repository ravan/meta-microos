SUMMARY = "Process application arguments the same way as getopt_long"
DESCRIPTION = "alt-getopt is a module for Lua programming language for \
processing application's arguments the same way BSD/GNU \
getopt_long(3) functions do.  The main goal is compatibility \
with SUS 'Utility Syntax Guidelines' guidelines 3-13."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "lua55-alt-getopt-0.8.1-6.3.noarch.rpm"
RPM_HASH = "dd2eda669981a52db6ad4efeaf8cbdf4eb82e93ddd85ad14cd939c719d16cdfa6b9a345d55846d32ca986b24de2d48cf53790908fedd3656a0ff2c9e0f7503a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-alt-getopt"

RDEPENDS:${PN} += "lua55"

inherit rpm
