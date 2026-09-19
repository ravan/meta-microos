SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python313-pytest-djangoapp-1.8.0-1.1.noarch.rpm"
RPM_HASH = "cd972fe2d0cba2680ebce1eb58863b56f66703d232cb283035994b1e7fb0dcaaf75dfb6ce69081dd0c4ab3e0c037ed9a391767bf941baa9829ef110d29b02330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-djangoapp \
python3.13dist-pytest-djangoapp \
python313-pytest-djangoapp \
python3dist-pytest-djangoapp"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-pytest"

inherit rpm
