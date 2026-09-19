SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "python314-django-upgrade-1.30.0-1.3.noarch.rpm"
RPM_HASH = "b070fd416a9918f93c0dec9058ac85fb35e94bbe4a94abd74de7fa2a54eb313d8f3b481641d2ef63feb09e5ae40ac7c3418ff7404e1974f963104e2b56ea528c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-django-upgrade \
python314-django-upgrade \
python3dist-django-upgrade"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-tokenize-rt \
update-alternatives"

inherit rpm
