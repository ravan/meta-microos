SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python313-django-json-widget-2.1.1-1.2.noarch.rpm"
RPM_HASH = "17c522586b44690092e8f5781adcfd26152ed944b70f1e3920ad46110baf3189daee4eb42832e90e9ba9050b63f4652e19ce65272d91c48c4a448ec55b8996c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-json-widget \
python3.13dist-django-json-widget \
python313-django-json-widget \
python3dist-django-json-widget"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
