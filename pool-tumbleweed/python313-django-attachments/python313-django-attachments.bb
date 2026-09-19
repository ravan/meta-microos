SUMMARY = "Attach files to any Django model"
DESCRIPTION = "django-attachments is generic Django application to attach Files (Attachments) to any model."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "python313-django-attachments-1.12-2.1.noarch.rpm"
RPM_HASH = "e5d15e8dfd0ee9100be85fc173f3e0af29c2b70a3f171f1188b56d28f6e598a8a066806cb6c23d1a6c2db5fbbf83ab8e4fed0e7aa97699178a8c6a51332bb161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-attachments \
python3.13dist-django-attachments \
python313-django-attachments \
python3dist-django-attachments"

RDEPENDS:${PN} += "python-abi \
python313-django"

inherit rpm
