SUMMARY = "David Kolf's JSON module for Lua"
DESCRIPTION = "dkjson is a module for encoding and decoding JSON data. It \
supports UTF-8. \
 \
JSON (JavaScript Object Notation) is a format for serializing \
data based on the syntax for JavaScript data structures. \
 \
dkjson is written in Lua without any dependencies, but \
when LPeg is available dkjson can use it to speed up decoding."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "luajit-dkjson-2.8.0-3.2.noarch.rpm"
RPM_HASH = "7ed76919e8c0dd6b6dc379f859b052fde6b9f6a884b44d63b6fe52c22e592b401fe75b0bf24e82088fbde81cac75d02199ac743cafd456e2e43e62dac9db226c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-dkjson"

RDEPENDS:${PN} += "luajit \
luajit-lpeg"

inherit rpm
