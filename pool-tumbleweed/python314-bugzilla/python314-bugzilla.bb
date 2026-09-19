SUMMARY = "Python library for Bugzilla"
DESCRIPTION = "This is a Python module that provides a Python-ish interface to \
Bugzilla over XMLRPC. It supports the Web Services provided by \
upstream Bugzilla 3.0 and 3.2. \
 \
It also includes a 'bugzilla' commandline client which can be used for quick, \
ad-hoc bugzilla jiggery-pokery."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.0"

RPM_NAME = "python314-bugzilla-3.3.0-1.4.noarch.rpm"
RPM_HASH = "7348cf742fa2aec4d05ab7709ca57b9e026dd4803ee1cb8366fae7d693e0c7e3c3e045509064f0f7851d4fdd022d1171f5648717ebfb60460f9d56aefcca87ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-bugzilla \
python314-bugzilla \
python3dist-python-bugzilla"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-requests"

inherit rpm
