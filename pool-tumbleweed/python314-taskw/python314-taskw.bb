SUMMARY = "Python bindings for taskwarrior"
DESCRIPTION = "Python bindings for your taskwarrior database."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python314-taskw-2.0.0-2.8.noarch.rpm"
RPM_HASH = "5c5ea774d93c454de50f52cdc4f8443f7e222b46fac948520601044b0c0889eee80bf0744d5d32d800916efda6ceb0d55f36604cee744ae175f9935cbd88117e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-taskw \
python314-taskw \
python3dist-taskw"

RDEPENDS:${PN} += "python-abi \
python314-kitchen \
python314-python-dateutil \
python314-pytz \
taskwarrior"

inherit rpm
