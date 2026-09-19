SUMMARY = "Python library for the Redmine RESTful API"
DESCRIPTION = "Python Redmine is a library for communicating with a Redmine \
project management application. Redmine exposes some of it's data \
via REST API for which Python Redmine provides a simple but \
powerful Pythonic API inspired by a well-known Django ORM."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python314-python-redmine-2.5.0-2.5.noarch.rpm"
RPM_HASH = "b7df4db55eb4a7c3be86788a4505f70d89ed267ca34a9ef473d5302a58e7924a459c6add9e705864d8dc1012390e4999fc785fe850cae0d88aa6b75bb0b89bd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-redmine \
python314-python-redmine \
python3dist-python-redmine"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
