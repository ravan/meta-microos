SUMMARY = "Attach files to any Django model"
DESCRIPTION = "django-attachments is generic Django application to attach Files (Attachments) to any model."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "python314-django-attachments-1.12-2.1.noarch.rpm"
RPM_HASH = "41ef8a31c78a9df40f8f5adfc1abab8c1c68b4a1459eaeac872e65dbbe410b9ba0b67182f2f3afce86dd927057180a9ee9774f157d83393bf7ed87be950f527c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-attachments \
python314-django-attachments \
python3dist-django-attachments"

RDEPENDS:${PN} += "python-abi \
python314-django"

inherit rpm
