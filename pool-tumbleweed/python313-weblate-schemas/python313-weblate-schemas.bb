SUMMARY = "A collection of schemas used by Weblate"
DESCRIPTION = "This module contains schemas used in Weblate exports."
LICENSE = "MIT"

PV = "2025.6"

RPM_NAME = "python313-weblate-schemas-2025.6-1.4.noarch.rpm"
RPM_HASH = "f919eb75975857bd52e0ad6820d8f23667025c58e8fc0019e1b233ddfe84ced45313e28832a241d7c65cece111abc73c1b35f1bb951ed1aee0a7638cad0a9111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-weblate-schemas \
python3.13dist-weblate-schemas \
python313-weblate-schemas \
python3dist-weblate-schemas"

RDEPENDS:${PN} += "python-abi \
python313-jsonschema \
python313-jsonschema-format"

inherit rpm
