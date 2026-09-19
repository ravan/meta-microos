SUMMARY = "Development files for the Atheme IRC Services core"
DESCRIPTION = "Atheme is a set of modular IRC services (NickServ, ChanServ, etc.) \
designed to link with many kinds of IRCds. \
 \
This package contains the development headers for the library found \
in libathemecore1."
LICENSE = "MIT"

PV = "7.2.12"

RPM_NAME = "atheme-devel-7.2.12-5.6.aarch64.rpm"
RPM_HASH = "b2ee51892968a9b76dc2c48b2dd0e8672dd04d275b3e546ea04415196c863678ded32a4c7ddfd54da94c45c75ce700e3e7f4166cbaaced5a4b70ce4da0059ccd"

RPROVIDES:${PN} += "atheme-devel \
pkgconfig-atheme-services"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libathemecore1"

inherit rpm
