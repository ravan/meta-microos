SUMMARY = "Module for generating tables in terminals from a nested list of strings"
DESCRIPTION = "terminaltables draws tables in terminal/console applications from a \
list of lists of strings, and supports multi-line rows."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-terminaltables3-4.0.0-1.4.noarch.rpm"
RPM_HASH = "994d6de3ae6b4a7c9807638b559f00c7b43da50799787e145e7d348c5adacfcd685fff84107e18c611e93a6678dad7e1435f3741c51540dcba3ca3fac28c2e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-terminaltables3 \
python3.13dist-terminaltables3 \
python313-terminaltables3 \
python3dist-terminaltables3"

RDEPENDS:${PN} += "python-abi \
python313-colorama \
python313-colorclass \
python313-termcolor"

inherit rpm
