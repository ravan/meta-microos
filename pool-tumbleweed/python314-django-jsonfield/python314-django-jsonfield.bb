SUMMARY = "A reusable Django field to store validated JSON"
DESCRIPTION = "Django-jsonfield is a reusable Django field that allows you to \
store validated JSON in your model."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python314-django-jsonfield-3.1.0-4.9.noarch.rpm"
RPM_HASH = "199a909ca09fb3842acf937494b901160ce14f0c7ef248aeecc2f112a7def51ef1ec35d36b83eed9ff98e151f17407010cad44da037ccd7870baa4e762a9b0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonfield \
python314-django-jsonfield \
python3dist-jsonfield"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
