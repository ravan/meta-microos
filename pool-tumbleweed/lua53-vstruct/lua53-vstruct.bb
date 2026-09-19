SUMMARY = "Lua library to manipulate binary data"
DESCRIPTION = "A Lua library for packing and unpacking binary data, supporting arbitrary \
(byte-aligned) widths, named fields, and repetition."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "lua53-vstruct-2.2.0-4.2.noarch.rpm"
RPM_HASH = "5ff89254a0572fce86183dd2c15f7d1aa46c6fd87aeb2cb50af35da7148afedd6effb602fe10d6b515cefd5c00054c418b271e50db080abb69729492b0e1ac30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-vstruct"

RDEPENDS:${PN} += "lua53"

inherit rpm
