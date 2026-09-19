SUMMARY = "Python library for the Redmine RESTful API"
DESCRIPTION = "Python Redmine is a library for communicating with a Redmine \
project management application. Redmine exposes some of it's data \
via REST API for which Python Redmine provides a simple but \
powerful Pythonic API inspired by a well-known Django ORM."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python313-python-redmine-2.5.0-2.5.noarch.rpm"
RPM_HASH = "f63af25a753c9759dd2dcf52b5253924f3df6bfebf842d549cfb99eb283975ad8921bef6d05d2318bcdc7fa101f10de6da282d662060189a4b1f8a166610ab85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-redmine \
python3.13dist-python-redmine \
python313-python-redmine \
python3dist-python-redmine"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
