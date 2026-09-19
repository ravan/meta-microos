SUMMARY = "Django template coveragepy plugin"
DESCRIPTION = "Django template coverage.py plugin"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python314-django-coverage-plugin-3.2.2-1.2.noarch.rpm"
RPM_HASH = "2f272b8939d576b318a60096ecc3d743a9d5a09088ebc37536b9d39705942eda0d470482737b87e5a3cb1dba460ac84ff9b5e04141d4e739e727d10bf82c7f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-coverage-plugin \
python314-django-coverage-plugin \
python3dist-django-coverage-plugin"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-coverage"

inherit rpm
