SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.5.1"

RPM_NAME = "python312-django-compressor-4.5.1-2.1.noarch.rpm"
RPM_HASH = "9433fed4608993c7a4ca548bc29bf0cd0ec9a7ff9d0a6c128fbfdfdd12a8eecb96c968cfd7be88f507dfddfab6737b40aa8d0830dfe2b33f629e71501e2f68c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-django-compressor \
python312-django-compressor \
python3dist-django-compressor"

RDEPENDS:${PN} += "python-abi \
python312-Django \
python312-beautifulsoup4 \
python312-csscompressor \
python312-django-appconf \
python312-rcssmin \
python312-rjsmin"

inherit rpm
