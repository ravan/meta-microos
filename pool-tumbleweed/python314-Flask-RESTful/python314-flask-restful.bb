SUMMARY = "Framework for creating REST APIs"
DESCRIPTION = "Flask-RESTful provides the building blocks for creating a REST API."
LICENSE = "BSD-3-Clause"

PV = "0.3.10"

RPM_NAME = "python314-Flask-RESTful-0.3.10-3.5.noarch.rpm"
RPM_HASH = "cb106fa95c2c8929c973da4590f352e3713eb5d665108f6e0c14d8302c0cf89dce5f6ae7fe6fd4745bf1df4f229eb908a9ad744da952c33e7446b67ceeb620c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flask-restful \
python314-Flask-RESTful \
python3dist-flask-restful"

RDEPENDS:${PN} += "python-abi \
python314-Flask \
python314-aniso8601 \
python314-pytz \
python314-six"

inherit rpm
