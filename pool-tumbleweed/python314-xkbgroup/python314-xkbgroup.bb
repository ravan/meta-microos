SUMMARY = "Query and change XKB layout state"
DESCRIPTION = "Python library to query and change XKB layout state."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-xkbgroup-0.2.0-4.5.noarch.rpm"
RPM_HASH = "d320893f3c8ece34232a5501280fb8d2365c95197df2481b7cef7b4855a6a90e84682c162ff361b6194e97b2e41c927046b6e2052319ad93340f0152b7317bb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xkbgroup \
python314-xkbgroup \
python3dist-xkbgroup"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives \
xorg-x11-server"

inherit rpm
