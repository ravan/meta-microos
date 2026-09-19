SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python314-pytest-djangoapp-1.8.0-1.1.noarch.rpm"
RPM_HASH = "4162e5c47c33bb6d4278657636941b9d14cc138fd0b37a33d88a70b7f03bca2114a80b05ea50edf478c5f4e25a3059d93cc96d7d52f724a506d6447fa634e039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-djangoapp \
python314-pytest-djangoapp \
python3dist-pytest-djangoapp"

RDEPENDS:${PN} += "python-abi \
python314-Django \
python314-pytest"

inherit rpm
