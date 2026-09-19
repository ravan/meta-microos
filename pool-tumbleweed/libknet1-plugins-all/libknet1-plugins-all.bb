SUMMARY = "Provides libknet1 plugins meta package"
DESCRIPTION = " Meta package to install all of libknet1 plugins"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-plugins-all-1.33-2.2.aarch64.rpm"
RPM_HASH = "16ee675d10eaf48efe211c454ae6d80fa5d6df5634bd2c31156815734d76b0b983919f01f8482cf2a947acf628965df7bbf378c95c531912556947cce1732254"

RPROVIDES:${PN} += "libknet1-plugins-all"

RDEPENDS:${PN} += "libknet1-compress-plugins-all \
libknet1-crypto-plugins-all"

inherit rpm
