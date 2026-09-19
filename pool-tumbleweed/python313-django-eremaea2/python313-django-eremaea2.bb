SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "python313-django-eremaea2-2.1.1-1.4.noarch.rpm"
RPM_HASH = "05cfdfca9ec5cb695b230464b5431117eb510e13ae609479582c499dfcd2536fd5f277b6b210bc4bb20e2cf7101b858504a34ef5e41a3142327b3f8f991459f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-eremaea2 \
python3.13dist-django-eremaea2 \
python313-django-eremaea2 \
python3dist-django-eremaea2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
eremaea \
python-abi \
python313-click \
python313-django-filter \
python313-djangorestframework \
python313-drf-spectacular \
python313-python-magic \
python313-requests \
python313-requests-toolbelt \
update-alternatives"

inherit rpm
