SUMMARY = "CSV Tools for Django REST Framework"
DESCRIPTION = "CSV Tools for Django REST Framework"
LICENSE = "BSD-1-Clause"

PV = "3.0.2"

RPM_NAME = "python314-djangorestframework-csv-3.0.2-1.5.noarch.rpm"
RPM_HASH = "28c54ec5cd5657a54f0b3143c21b47c4a06b863b890b21b308808535039da6a828ad642672ab452739a0e0b3db4a010ddc65d0b22457d596cad351057c6ba29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-djangorestframework-csv \
python314-djangorestframework-csv \
python3dist-djangorestframework-csv"

RDEPENDS:${PN} += "python-abi \
python314-djangorestframework"

inherit rpm
