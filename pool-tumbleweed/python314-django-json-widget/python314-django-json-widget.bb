SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python314-django-json-widget-2.1.1-1.2.noarch.rpm"
RPM_HASH = "b39520cce89b3f63dbcced2632465461a8ee87bfe7da92d3cf78dfca584f6148af25d78e6cce1eb7168b94b2898b60054e2cba06cc53d811cf27866c9091a701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-json-widget \
python314-django-json-widget \
python3dist-django-json-widget"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
