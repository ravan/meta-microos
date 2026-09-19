SUMMARY = "LUA bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.7.2"

RPM_NAME = "lua-Hamliblua-4.7.2-1.3.aarch64.rpm"
RPM_HASH = "2d896b6c57bc4811ab0842374f06d92ee48a242f0e20861fefaf505d00bb4f8b65ee2c3800e8a9eee3a965af2ecd49b92d34d319c99c5cb498d91d259bf4de36"

RPROVIDES:${PN} += "lua-Hamliblua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhamlib.so.4"

inherit rpm
