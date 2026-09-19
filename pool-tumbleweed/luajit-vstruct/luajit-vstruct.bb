SUMMARY = "Lua library to manipulate binary data"
DESCRIPTION = "A Lua library for packing and unpacking binary data, supporting arbitrary \
(byte-aligned) widths, named fields, and repetition."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "luajit-vstruct-2.2.0-4.2.noarch.rpm"
RPM_HASH = "66197a1e4392b004b7edd0acb6ec91f47cee43e47d48c1970583edd48aaefbafb1af110a05b6d777ae921830dbede633e25b9628a07122ae0609a4c86cf61cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-vstruct"

RDEPENDS:${PN} += "luajit"

inherit rpm
