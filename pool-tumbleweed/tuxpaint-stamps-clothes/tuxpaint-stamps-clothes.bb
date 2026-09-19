SUMMARY = "Clothes stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-clothes package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-clothes-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "f5d0ccdd3ce114a13e499b6c49c174953b6f34f746bbdf77b60af66cb34fbd9ef1c235f0ae27c75e7cd16e1dbcd1cf431c999feb90049157f77c92b74b8c5a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-clothes"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
