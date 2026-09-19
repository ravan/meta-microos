SUMMARY = "Python wrapper for Xvfb, Xephyr and Xvnc"
DESCRIPTION = "PyVirtualDisplay is a python wrapper for Xvfb, Xephyr and Xvnc."
LICENSE = "BSD-2-Clause"

PV = "3.0"

RPM_NAME = "python313-PyVirtualDisplay-3.0-6.5.noarch.rpm"
RPM_HASH = "53811d9494aea2a7ed848ed80e3e97bbfc38ae4a8765b2c42634a1f25970037c62257dc0e8a9fc671ebfbf1256c4863766c2d75098bc5add12fe50a618b81c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyVirtualDisplay \
python3.13dist-pyvirtualdisplay \
python313-PyVirtualDisplay \
python3dist-pyvirtualdisplay"

RDEPENDS:${PN} += "python-abi \
python313-EasyProcess \
xorg-x11-Xvfb"

inherit rpm
