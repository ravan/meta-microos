SUMMARY = "Daemon process control library and tools"
DESCRIPTION = "zdaemon is a Python package which provides APIs for managing \
applications run as daemons. Its principal use to date has been to \
manage the application server and storage server daemons for Zope / ZEO, \
although it is not limited to running Python-based applications"
LICENSE = "ZPL-2.1"

PV = "5.2.1"

RPM_NAME = "python314-zdaemon-5.2.1-1.4.noarch.rpm"
RPM_HASH = "ad4dc3d60beea8790b4d5990ed35fa1ad0f79986ee0b7b34b7221d162de11f034f4b54b5b1b7a5d6e331e288fcc176ef14440c35a1696d4416e795e9ec7155d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zdaemon \
python314-zdaemon \
python3dist-zdaemon"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-ZConfig \
python314-setuptools \
update-alternatives"

inherit rpm
