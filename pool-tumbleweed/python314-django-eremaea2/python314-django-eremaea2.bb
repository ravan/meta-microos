SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "python314-django-eremaea2-2.1.1-1.4.noarch.rpm"
RPM_HASH = "f78e94909908d64223291793538d8b21047b1a0b4a27deee9c2d69dedf299a6bcba3733f51e26f76ffb7b54b973dd3e55bb363c6e12742ae31d21977a4a8251b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-eremaea2 \
python314-django-eremaea2 \
python3dist-django-eremaea2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
eremaea \
python-abi \
python314-click \
python314-django-filter \
python314-djangorestframework \
python314-drf-spectacular \
python314-python-magic \
python314-requests \
python314-requests-toolbelt \
update-alternatives"

inherit rpm
