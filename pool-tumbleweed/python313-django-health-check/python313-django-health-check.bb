SUMMARY = "Run checks on Django and is dependent services"
DESCRIPTION = "This project checks for various conditions and provides reports when anomalous \
behavior is detected. \
 \
Services checked include databases, caches, queue servers, celery processes, etc."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python313-django-health-check-4.5.0-1.1.noarch.rpm"
RPM_HASH = "6c423bc4efda41b4495360a0c4e13055577c71377be3bf9538f8542dcbd382702b5cdeed4826a3a88057ad3a1f159bc6d3c212b92d8358fd9f7708d78096aa0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-health-check \
python3.13dist-django-health-check \
python313-django-health-check \
python3dist-django-health-check"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-dnspython"

inherit rpm
