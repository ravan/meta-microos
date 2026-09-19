SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.5.1"

RPM_NAME = "python311-django-compressor-4.5.1-2.1.noarch.rpm"
RPM_HASH = "34c7bb856bac5acf83a60ba30cc433f48613169ccc90a77b66ffaea9693ef0ac5f1bc3889c01aa6435f8c0bb0c13c690380de3f4c080608e50c78d8e624e5699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-compressor \
python311-django-compressor \
python3dist-django-compressor"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-beautifulsoup4 \
python311-csscompressor \
python311-django-appconf \
python311-rcssmin \
python311-rjsmin"

inherit rpm
