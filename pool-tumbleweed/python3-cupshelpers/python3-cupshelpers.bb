SUMMARY = "High-level Python Bindings for CUPS"
DESCRIPTION = "This package provides high-level python bindings for CUPS, and can be \
used on top of python3-cups."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "python3-cupshelpers-1.5.18-9.6.noarch.rpm"
RPM_HASH = "91f0a21a4ba8835265d156738b8c7d133c299ca619362f4ccd3ae8cf3e5c2b55fa87f54811dc64865536e0eeeefbd573a05031c11900ebfc6ba085b7eb1e58a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-python3-cupshelpers \
python3-cupshelpers \
python3.13dist-cupshelpers \
python3dist-cupshelpers"

RDEPENDS:${PN} += "python-abi \
python3-cups \
python3-pycurl \
python3-requests"

inherit rpm
