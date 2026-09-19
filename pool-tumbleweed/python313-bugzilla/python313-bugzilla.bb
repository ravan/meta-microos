SUMMARY = "Python library for Bugzilla"
DESCRIPTION = "This is a Python module that provides a Python-ish interface to \
Bugzilla over XMLRPC. It supports the Web Services provided by \
upstream Bugzilla 3.0 and 3.2. \
 \
It also includes a 'bugzilla' commandline client which can be used for quick, \
ad-hoc bugzilla jiggery-pokery."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.0"

RPM_NAME = "python313-bugzilla-3.3.0-1.4.noarch.rpm"
RPM_HASH = "45fbc3f667fff038bfeff46ee11a1f3b3c53ab1b030ab6aee997aa8af3f0a71b8f11cb88ae97c1ab099cc2fa47d8e546303dc2e54d2471c67932470c86ead8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bugzilla \
python3.13dist-python-bugzilla \
python313-bugzilla \
python3dist-python-bugzilla"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-requests"

inherit rpm
