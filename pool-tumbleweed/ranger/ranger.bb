SUMMARY = "Console File Manager"
DESCRIPTION = "Ranger is a console file manager that gives you greater flexibility and a \
good overview of your files without having to leave your text console. It \
visualizes the directory tree in two dimensions: the directory hierarchy on \
one, lists of files on the other, with a preview to the right. \
 \
The default keys are similar to those of Vim, Emacs and Midnight Commander, \
though ranger is easily controllable with just the arrow keys or the mouse."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.4+git20250910.3f7a3546"

RPM_NAME = "ranger-1.9.4+git20250910.3f7a3546-1.3.noarch.rpm"
RPM_HASH = "1582f7f28d3e874db4c4e0b086b1d256177f42f1e6c6a6ec52aadaef5fd9366fc1868821aff46c0d629c1b784e951ca5931320248620a632205c1263083b555f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-ranger-fm \
python3dist-ranger-fm \
ranger"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
file \
python-abi \
python3-curses"

inherit rpm
