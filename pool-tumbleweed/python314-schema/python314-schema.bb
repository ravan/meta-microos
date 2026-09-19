SUMMARY = "Data validation library"
DESCRIPTION = "Schema is a library for validating Python data structures, such as those \
obtained from config-files, forms, external services or command-line \
parsing, converted from JSON/YAML (or something else) to Python data-types."
LICENSE = "MIT"

PV = "0.7.8"

RPM_NAME = "python314-schema-0.7.8-1.4.noarch.rpm"
RPM_HASH = "131f3a81e7325b8ac5645cb8402d83f710fd647b4cd896626f5c5cdc239755dbf64f26c470d6b2d217e1ccbe01338c65db25ec8875362cb0950b6ba05a370e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-schema \
python314-schema \
python3dist-schema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
