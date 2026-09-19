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

RPM_NAME = "luajit-datafile-0.11-1.2.noarch.rpm"
RPM_HASH = "603ab53f02f90f4d625fe2e4f1015e07dd391ce3c88c23263947e07f63be2d9e6415b3f806884230452fa388cae90d876a920efabd6119d09b89f12b50b9567b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-datafile"

RDEPENDS:${PN} += "luajit"

inherit rpm
