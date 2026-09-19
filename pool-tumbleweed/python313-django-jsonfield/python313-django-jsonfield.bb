SUMMARY = "A reusable Django field to store validated JSON"
DESCRIPTION = "Django-jsonfield is a reusable Django field that allows you to \
store validated JSON in your model."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python313-django-jsonfield-3.1.0-4.9.noarch.rpm"
RPM_HASH = "0c34050d07741671f92eedcf764a4c37e85d9497bf1b69a0009d9a85abd87a5b12be7362887af5f7da13406c6d9962398c7f605fccf97597e05bcaee5a07a5a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-jsonfield \
python3.13dist-jsonfield \
python313-django-jsonfield \
python3dist-jsonfield"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
