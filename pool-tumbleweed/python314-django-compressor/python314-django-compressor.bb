SUMMARY = "Python module to compress linked/inline JavaScript/CSS to cached files"
DESCRIPTION = "Django Compressor combines and compresses linked and inline Javascript or CSS \
in a Django templates into cacheable static files by using the 'compress' \
template tag."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.6.0"

RPM_NAME = "python314-django-compressor-4.6.0-3.1.noarch.rpm"
RPM_HASH = "f90fdd592516efe40c24cb886a2583bb7da983926d1dee85beac6cd3a5720dd7ea2c02403f2d1c7c5dece9ba93a03d084b228c7337ff1d69f2548873fd68f582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-compressor \
python314-django-compressor \
python3dist-django-compressor"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-django-appconf \
python314-rcssmin \
python314-rjsmin"

inherit rpm
