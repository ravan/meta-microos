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

RPM_NAME = "python314-pytest-localserver-0.10.0-1.3.noarch.rpm"
RPM_HASH = "5a9be0f7e1934c27ca4b11bfd17b05adb7430343f22587ec6f35666cdd8742cf3ca1fd09d4f93b990c4d786023937f4b5e36b7b0347888a9bca0000fc72706f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-localserver \
python314-pytest-localserver \
python3dist-pytest-localserver"

RDEPENDS:${PN} += "python-abi \
python314-Werkzeug \
python314-pytest"

inherit rpm
