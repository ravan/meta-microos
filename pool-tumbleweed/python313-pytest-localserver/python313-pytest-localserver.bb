SUMMARY = "Plugin for py.test to test server connections locally"
DESCRIPTION = "The pytest-localserver package is a plugin for the `pytest`_ testing framework \
which enables you to test server connections locally. \
 \
Sometimes `monkeypatching`_ ``urllib2.urlopen()`` just does not cut it, for \
instance if you work with ``urllib2.Request``, define your own openers/handlers \
or work with ``httplib``. In these cases it may come in handy to have an HTTP \
server running locally which behaves just like the real thing. Well, look \
no further!"
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python313-pytest-localserver-0.10.0-1.3.noarch.rpm"
RPM_HASH = "92e9533ea1ae889f695bd9d317b65b6c21b151dbb4a5751cfc11390fd16ef8a67b9acb6d1f7d3e8a4e4dd44d86a2ad32257c8db4a0849aa29afb148fae41fd3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-localserver \
python3.13dist-pytest-localserver \
python313-pytest-localserver \
python3dist-pytest-localserver"

RDEPENDS:${PN} += "python-abi \
python313-Werkzeug \
python313-pytest"

inherit rpm
