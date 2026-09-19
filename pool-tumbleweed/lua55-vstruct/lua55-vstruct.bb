SUMMARY = "Lua library to manipulate binary data"
DESCRIPTION = "A Lua library for packing and unpacking binary data, supporting arbitrary \
(byte-aligned) widths, named fields, and repetition."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "lua55-vstruct-2.2.0-4.2.noarch.rpm"
RPM_HASH = "da866147158b53acde2a4f76ee5633926b8a9bc1cd31979066f81db7cb250ef87bba097c6060e3a294160e86f0972fb5f865dd0d8b6b6b91a93092172d054eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-vstruct"

RDEPENDS:${PN} += "lua55"

inherit rpm
