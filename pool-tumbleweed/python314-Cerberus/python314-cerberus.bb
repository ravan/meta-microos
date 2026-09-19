SUMMARY = "Extensible schema and data validation tool for Python dictionaries"
DESCRIPTION = "Cerberus provides type checking and other base functionality out of the box and \
is designed to be non-blocking and extensible, allowing for custom \
validation."
LICENSE = "ISC"

PV = "1.3.8"

RPM_NAME = "python314-Cerberus-1.3.8-1.4.noarch.rpm"
RPM_HASH = "b285a1d929b286978e29ec4c3ec6e6c5971abd50571ce4c3e417e74c2dfc85918049380dba4f56d0648cf7067b15adc042be89418b9d35ed58be5bf43f982378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cerberus \
python314-Cerberus \
python3dist-cerberus"

RDEPENDS:${PN} += "python-abi"

inherit rpm
