SUMMARY = "Django model field that can hold a geoposition"
DESCRIPTION = "Django model field that can hold a geoposition, and corresponding admin widget."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-django-geoposition-0.3.0-3.9.noarch.rpm"
RPM_HASH = "48ccfcd5532f9b01f706227cffabcaa955d06401f070ec5c5a9763e36b7025525358c81476cc7d1caed067b2a0f136d15b06f7d14693b9a17976a602d5025bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-geoposition \
python314-django-geoposition \
python3dist-django-geoposition"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
