SUMMARY = "Python Task Warrior library"
DESCRIPTION = "Tasklib is a Python library for interacting with taskwarrior \
databases, using a queryset API similar to that of Django's ORM."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python314-tasklib-2.5.1-2.10.noarch.rpm"
RPM_HASH = "550c2ef6d44741ef3dc17959b71c4881631749607558699c06128d8c782868a13c15b31d5b187f0bde958ff7bd5e89564106027ba296576bcb15ded1cce81b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tasklib \
python314-tasklib \
python3dist-tasklib"

RDEPENDS:${PN} += "python-abi \
python314-pytz \
python314-tzlocal \
taskwarrior"

inherit rpm
