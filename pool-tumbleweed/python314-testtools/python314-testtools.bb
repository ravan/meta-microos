SUMMARY = "Extensions to the Python Standard Library Unit Testing Framework"
DESCRIPTION = "testtools is a set of extensions to the Python standard library's unit tests \
framework. These extensions have been derived from many years of experience \
with unit tests in Python and come from many different sources. testtools \
gives you the very latest in unit testing technology in a way that will \
work with Python 3.10+ and PyPy3."
LICENSE = "MIT"

PV = "2.9.1"

RPM_NAME = "python314-testtools-2.9.1-1.3.noarch.rpm"
RPM_HASH = "3e704063337cf145fbccfa46996e7423e9a41377bcf1e8b7d62ea9f266de4e49d4f7025d6493cd07b33892420c0e64105f131d9d9f12c1b64ee6a7e7ea22d145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-testtools \
python314-testtools \
python3dist-testtools"

RDEPENDS:${PN} += "python-abi \
python314-Twisted"

inherit rpm
