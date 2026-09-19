SUMMARY = "Python screenshots"
DESCRIPTION = "The pyscreenshot module can be used to copy the contents of the screen \
to a Pillow image memory using various back-ends. \
Replacement for the ImageGrab Module."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python314-pyscreenshot-3.1-3.5.noarch.rpm"
RPM_HASH = "ffafebaa3fee422ce07047f09dd6954ec272c0904d1de8dbbcf5ec19de425ee027bea6138a78c5b2af97e1489ebc5b02929cd7b2aed249787797eb7cf14c94fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyscreenshot \
python314-pyscreenshot \
python3dist-pyscreenshot"

RDEPENDS:${PN} += "python-abi \
python314-EasyProcess \
python314-entrypoint2 \
python314-jeepney \
python314-mss \
xorg-x11-server-extra"

inherit rpm
