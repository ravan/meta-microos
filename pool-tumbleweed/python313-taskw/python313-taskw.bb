SUMMARY = "Python bindings for taskwarrior"
DESCRIPTION = "Python bindings for your taskwarrior database."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python313-taskw-2.0.0-2.8.noarch.rpm"
RPM_HASH = "aa0fca020c7aaf356b2d1e48812a9cca8527c5bc1fe37da379967070005cdb2f589dfebac087369f234ed86fca839131ee3c1e1881fbeedd82dc19a447332800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-taskw \
python3.13dist-taskw \
python313-taskw \
python3dist-taskw"

RDEPENDS:${PN} += "python-abi \
python313-kitchen \
python313-python-dateutil \
python313-pytz \
taskwarrior"

inherit rpm
