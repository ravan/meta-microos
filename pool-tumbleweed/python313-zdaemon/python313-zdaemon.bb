SUMMARY = "Daemon process control library and tools"
DESCRIPTION = "zdaemon is a Python package which provides APIs for managing \
applications run as daemons. Its principal use to date has been to \
manage the application server and storage server daemons for Zope / ZEO, \
although it is not limited to running Python-based applications"
LICENSE = "ZPL-2.1"

PV = "5.2.1"

RPM_NAME = "python313-zdaemon-5.2.1-1.4.noarch.rpm"
RPM_HASH = "b57052a48723834db49070db847d1c9d9a30290665e247d89b661a8b4ac91e5b73c0524f145882ff4ff02e82fa227a72123c6b6dbd789ffb078f4f3c21cc5dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zdaemon \
python3.13dist-zdaemon \
python313-zdaemon \
python3dist-zdaemon"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-ZConfig \
python313-setuptools \
update-alternatives"

inherit rpm
