SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python314-PyVirtualDisplay-3.0-6.5.noarch.rpm"
RPM_HASH = "1663c1c690db8698009d41dae41dfd9602817f02b1f06c0dbc9409100be4f76140b6d916a7360f2d94debe63335aa7a9d852f0223b7a47cb586e1d7dc4764a86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyvirtualdisplay \
python314-PyVirtualDisplay \
python3dist-pyvirtualdisplay"

RDEPENDS:${PN} += "python-abi \
python314-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
