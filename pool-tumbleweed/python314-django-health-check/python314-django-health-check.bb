SUMMARY = "Run checks on Django and is dependent services"
DESCRIPTION = "This project checks for various conditions and provides reports when anomalous \
behavior is detected. \
 \
Services checked include databases, caches, queue servers, celery processes, etc."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python314-django-health-check-4.5.0-1.1.noarch.rpm"
RPM_HASH = "4809eb89df3bd96b8684107ebe42afed7fe3f9e8835cea46829948b26d6fc07baf075202fa71b8891a8f7193d5d4b2d30e554cad007a0d5988cd8466835271fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-health-check \
python314-django-health-check \
python3dist-django-health-check"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-dnspython"

inherit rpm
