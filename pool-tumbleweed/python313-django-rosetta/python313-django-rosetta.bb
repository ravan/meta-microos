SUMMARY = "Django application that eases the translation of Django projects"
DESCRIPTION = "Django application that eases the translation of Django projects."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python313-django-rosetta-0.10.3-1.3.noarch.rpm"
RPM_HASH = "3643e144fde8a01183dbd81f7307fdc72be02bf760dc91f7d12f1c1347c2187a2bd66d48bb39ea282d4e66c7b8ba73892ae43d85b5474a754910051c69846610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-rosetta \
python3.13dist-django-rosetta \
python313-django-rosetta \
python3dist-django-rosetta"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-polib \
python313-requests"

inherit rpm
