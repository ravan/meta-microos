SUMMARY = "MirBSD Korn Shell"
DESCRIPTION = "The MirBSD Korn Shell is an actively developed free implementation of the Korn \
Shell programming language and a successor to the Public Domain Korn Shell \
(pdksh)."
LICENSE = "ISC & MirOS"

PV = "59c"

RPM_NAME = "mksh-59c-7.3.aarch64.rpm"
RPM_HASH = "6687efe0e4b2c1d7f5f8fa9231bdff16725699cdb8bf5a2df200a89de7b7ba3b717069be83fb20c35abcda31782e16e852a6e6c79fd26d488eba2ff85f3d51ef"

RPROVIDES:${PN} += "/usr/bin/ksh \
mksh \
pdksh"

RDEPENDS:${PN} += "alts \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
