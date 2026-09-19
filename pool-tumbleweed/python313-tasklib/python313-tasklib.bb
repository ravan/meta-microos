SUMMARY = "Python Task Warrior library"
DESCRIPTION = "Tasklib is a Python library for interacting with taskwarrior \
databases, using a queryset API similar to that of Django's ORM."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python313-tasklib-2.5.1-2.10.noarch.rpm"
RPM_HASH = "f9a73022ca0f743329ab00c6b31bcbc4918f7572abd34bc3a4afc4e07f8776c729d35b16babdba7403e6052260bad504e668b75d90d3ca54d093841358531ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tasklib \
python3.13dist-tasklib \
python313-tasklib \
python3dist-tasklib"

RDEPENDS:${PN} += "python-abi \
python313-pytz \
python313-tzlocal \
taskwarrior"

inherit rpm
