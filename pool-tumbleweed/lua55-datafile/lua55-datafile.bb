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

RPM_NAME = "lua55-datafile-0.11-1.2.noarch.rpm"
RPM_HASH = "65632bca3b646518d9313f24ba40cf04b18988a91f5fb70755065d840acde8f28762142ba7e115249ebb5aaf0ff5ba573046493a10ae7ac6dc172bc181285516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-datafile"

RDEPENDS:${PN} += "lua55"

inherit rpm
