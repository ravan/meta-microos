SUMMARY = "Framework for creating REST APIs"
DESCRIPTION = "Flask-RESTful provides the building blocks for creating a REST API."
LICENSE = "BSD-3-Clause"

PV = "0.3.10"

RPM_NAME = "python313-Flask-RESTful-0.3.10-3.5.noarch.rpm"
RPM_HASH = "7f78cb2b3c2721837d6a4a8a8ffd33467ebb9cf8eee6b4da78bc8b9ac6204d2949cde958177e12e7737425d7e84ccb5cbc1c34eb4b1db6c45420182c2baaad68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-RESTful \
python3.13dist-flask-restful \
python313-Flask-RESTful \
python3dist-flask-restful"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-aniso8601 \
python313-pytz \
python313-six"

inherit rpm
