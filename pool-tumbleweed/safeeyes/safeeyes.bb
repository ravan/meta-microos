SUMMARY = "Tool for reminding the user to take breaks"
DESCRIPTION = "This utility reminds the user to take breaks whilst they are working \
at the computer in an effort to alleviate eye strain (asthenopia)."
LICENSE = "GPL-3.0-only"

PV = "3.5.1"

RPM_NAME = "safeeyes-3.5.1-1.1.noarch.rpm"
RPM_HASH = "9e716c9c59d3971a157436cd0a3d4d77416f7a01cbd95798d313e511037143f55897e99d9845415cc7db5af4f35252465e8700872691283ced433bad48522f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-safeeyes \
python3dist-safeeyes \
safeeyes"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Babel \
python3-cairo \
python3-croniter \
python3-gobject \
python3-packaging \
python3-psutil \
python3-python-xlib \
typelib-AppIndicator3 \
typelib-Notify"

inherit rpm
