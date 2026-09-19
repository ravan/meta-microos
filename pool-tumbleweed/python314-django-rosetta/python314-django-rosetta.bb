SUMMARY = "Django application that eases the translation of Django projects"
DESCRIPTION = "Django application that eases the translation of Django projects."
LICENSE = "MIT"

PV = "0.10.3"

RPM_NAME = "python314-django-rosetta-0.10.3-1.3.noarch.rpm"
RPM_HASH = "ddb90919bc6af60bce12e0c5fefb79c78e81ee14c8d80c6a493e65efb60017fc1663efb04d26fda5211aeb936d0ac2cc36afb3d3ccfc386caeb3a715c1c7bef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-rosetta \
python314-django-rosetta \
python3dist-django-rosetta"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-polib \
python314-requests"

inherit rpm
