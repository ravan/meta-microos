SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.6.0"

RPM_NAME = "python313-django-compressor-4.6.0-3.1.noarch.rpm"
RPM_HASH = "161012d46e8ca607f1c44c4dc191600d9c4baa1c203e8bd28f2ddc55153bd2731d32818a9652627ca8dd1376e084c5e4fc756c5a655e5c803a0f1658c3ced465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-compressor \
python3.13dist-django-compressor \
python313-django-compressor \
python3dist-django-compressor"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-django-appconf \
python313-rcssmin \
python313-rjsmin"

inherit rpm
