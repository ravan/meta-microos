SUMMARY = "Extra class-based views for Django"
DESCRIPTION = "Extra class-based views for Django."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python313-django-extra-views-0.15.0-2.5.noarch.rpm"
RPM_HASH = "3be05a988a75f52bd2c990cb9e1163e3e5568d1d05c2574c4667bacb70528fd8e0df111146d64009e9c03e95f6e31da335499314154e20680c35cf62094a9eee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-extra-views \
python3.13dist-django-extra-views \
python313-django-extra-views \
python3dist-django-extra-views"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
