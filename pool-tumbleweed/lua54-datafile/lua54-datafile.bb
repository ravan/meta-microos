SUMMARY = "library for handling paths when loading data files"
DESCRIPTION = "A Lua library for handling paths when loading data files \
 \
Example usage: \
 \
    local datafile = require('datafile') \
 \
    local my_template = datafile.open('myapp/my_template.txt', 'r') \
 \
This will try to find and open myapp/my_template.txt in a series of \
locations, based on the 'opener' plugins found at the datafile.openers \
sequence, which contain opener functions loaded from the \
datafile.openers.* modules (you may modify the datafile.openers sequence \
in an analog fashion to the package.loaders/package.searchers sequence \
from Lua)."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "lua54-datafile-0.11-1.2.noarch.rpm"
RPM_HASH = "7c218cc7989e507f21f6283124a10cb6a25ffc927f4903c426e4ccb9fb88b5f13fb43a0e7335f43c3ba6f8b233d08d3080197a2dfe9cc361c42b29290693caef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-datafile \
lua54-datafile"

RDEPENDS:${PN} += "lua54"

inherit rpm
