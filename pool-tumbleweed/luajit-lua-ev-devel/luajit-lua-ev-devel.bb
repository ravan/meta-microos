SUMMARY = "Header files for luajit-lua-ev"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of luajit-lua-ev."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "luajit-lua-ev-devel-1.5-7.3.noarch.rpm"
RPM_HASH = "e4e3c261c6c9b49d2477f6e302b2889318b796485231b35ae4dd7fc367c4973cc60ef165232079748566fff9cb97c5885d0794721c47701bf7998c2596a7efd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-lua-ev-devel"

RDEPENDS:${PN} += "luajit-lua-ev"

inherit rpm
