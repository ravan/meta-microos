SUMMARY = "Extensions for Django"
DESCRIPTION = "Django-extensions bundles several useful \
additions for Django projects."
LICENSE = "BSD-3-Clause"

PV = "4.1"

RPM_NAME = "python313-django-extensions-4.1-2.1.noarch.rpm"
RPM_HASH = "9cd0c67ad06cbb7e0a79dd126a0a1917afe2b2d0610b10e7455a6487636682b0c828878fb430e58e145dc8e3d01212b043a9e989fb771f9b89a63c2ebe714feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-extensions \
python3.13dist-django-extensions \
python313-django-extensions \
python3dist-django-extensions"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
