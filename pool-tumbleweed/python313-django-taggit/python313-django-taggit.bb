SUMMARY = "Django-taggit is a reusable Django application for simple tagging"
DESCRIPTION = "Django-taggit is a reusable Django application for simple tagging."
LICENSE = "BSD-3-Clause-Clear"

PV = "6.1.0"

RPM_NAME = "python313-django-taggit-6.1.0-1.2.noarch.rpm"
RPM_HASH = "cde4e2f5c3816f59f833fb3b2e1ed6a2602fb8a0fcf0b3730312ae2e4a8a448dd003cb0cd03c19621184059df89db18f425ce175811d2b07578630b0b343dd4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-taggit \
python3.13dist-django-taggit \
python313-django-taggit \
python3dist-django-taggit"

RDEPENDS:${PN} += "python-abi \
python313-Django"

inherit rpm
