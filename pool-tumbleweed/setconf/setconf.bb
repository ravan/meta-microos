SUMMARY = "Utility to easily change settings in configuration files"
DESCRIPTION = "setconf is a small utility that can be used for changing settings in \
configuration textfiles."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.7"

RPM_NAME = "setconf-0.7.7-1.15.noarch.rpm"
RPM_HASH = "ba406f952d1b972fa9b6f5de460976436aaa89948bb8b658091eebc4a3538ca0d9c95e6f294bbcf5895ac5de28fb50c91e09cd290ccf3e679415bfea661925ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "setconf"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
