SUMMARY = "Pluggable search for Django"
DESCRIPTION = "Pluggable search for Django."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "python313-django-haystack-3.4.0-2.1.noarch.rpm"
RPM_HASH = "fd7240a051ef262cee968c5128331283da8a7ab3ddf5b82cabcb67d372b470bfd16a35e3f98ef6829bbc695ce85fc284501813d8c40a1a216d36a354766348f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-haystack \
python3.13dist-django-haystack \
python313-django-haystack \
python3dist-django-haystack"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-packaging"

inherit rpm
