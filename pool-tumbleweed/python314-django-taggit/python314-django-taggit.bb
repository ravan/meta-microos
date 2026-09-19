SUMMARY = "Django-taggit is a reusable Django application for simple tagging"
DESCRIPTION = "Django-taggit is a reusable Django application for simple tagging."
LICENSE = "BSD-3-Clause-Clear"

PV = "6.1.0"

RPM_NAME = "python314-django-taggit-6.1.0-1.2.noarch.rpm"
RPM_HASH = "21ee8211a82a81cd1231f3458b6e575339067d11b1cdd4add083489bae6284d269219552714baca8c1244185c14a423eb3d8edef2fcce6424cd25484e351f14c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-taggit \
python314-django-taggit \
python3dist-django-taggit"

RDEPENDS:${PN} += "python-abi \
python314-Django"

inherit rpm
