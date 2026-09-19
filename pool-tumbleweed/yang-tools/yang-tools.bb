SUMMARY = "Executable tools from the IETF YANG data modeling parser toolkit"
DESCRIPTION = "This package provides the 'yanglint' and 'yangre' tools which can be used \
during the creation of IETF YANG schemas.  The tools are not generally \
useful for normal operation where libyang primarily processes configuration \
data, not schemas."
LICENSE = "BSD-3-Clause"

PV = "3.13.6"

RPM_NAME = "yang-tools-3.13.6-3.3.aarch64.rpm"
RPM_HASH = "363d093afc6637969a8f5e148dbc3e483db81f0cd795ecf47e1889e67a6da4b2b560c278b5bffe9d6799c1a39943a19ec8eb715cee8554e728399177ef4ebd10"

RPROVIDES:${PN} += "yang-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyang.so.3"

inherit rpm
