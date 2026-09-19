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

RPM_NAME = "lua53-datafile-0.11-1.2.noarch.rpm"
RPM_HASH = "16e79162f5e639ddd9cfcd39ff2a3c693ac71031407671c351eb295a111f60903206ade611f56f413ffb12cbbe6b25f51a67d384ab5c881b7a00b8ca75cfc91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-datafile"

RDEPENDS:${PN} += "lua53"

inherit rpm
