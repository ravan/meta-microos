SUMMARY = "Sphinx objectsinv Inspection/Manipulation Tool"
DESCRIPTION = "Sphinx objects.inv Inspection/Manipulation Tool"
LICENSE = "MIT"

PV = "2.3.1.2"

RPM_NAME = "python314-sphobjinv-2.3.1.2-3.5.noarch.rpm"
RPM_HASH = "a5559dd3de523e269bf1fd0dacee86d1adb4d2cb59c6867eda2016023f11e5d8ec53a21fc096cdbaf2d60f1434b7b58cc7ac0d4f42b42a5ab61069c9e88372f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphobjinv \
python314-sphobjinv \
python3dist-sphobjinv"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-attrs \
python314-certifi \
python314-jsonschema"

inherit rpm
