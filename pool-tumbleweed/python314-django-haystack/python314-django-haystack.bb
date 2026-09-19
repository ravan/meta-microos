SUMMARY = "Pluggable search for Django"
DESCRIPTION = "Pluggable search for Django."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "python314-django-haystack-3.4.0-2.1.noarch.rpm"
RPM_HASH = "c653fb32107398221ae65cdc1d2fee2dd485acf368b20a7014c2858de2cc9bb9fec919f091c5b9656c6e3de6c6fafa32be96184e195d8713947f056ee56b256a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-haystack \
python314-django-haystack \
python3dist-django-haystack"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-packaging"

inherit rpm
