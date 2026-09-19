SUMMARY = "Process application arguments the same way as getopt_long"
DESCRIPTION = "alt-getopt is a module for Lua programming language for \
processing application's arguments the same way BSD/GNU \
getopt_long(3) functions do.  The main goal is compatibility \
with SUS 'Utility Syntax Guidelines' guidelines 3-13."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "luajit-alt-getopt-0.8.1-6.3.noarch.rpm"
RPM_HASH = "f5197cc608126c59ba23672722c2ab9f4955b73a935f41da3b491b1a1e6f664a5177c49dbb2f5c7e523b28f50f23636cfa3ede2ba24decf0e48a7bb971ac4cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-alt-getopt"

RDEPENDS:${PN} += "luajit"

inherit rpm
