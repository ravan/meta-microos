SUMMARY = "Simple creation of data classes from dictionaries"
DESCRIPTION = "Simplifies creating type-hinted data transfer objects (DTOs) from dictionaries, useful for data from HTTP requests or databases. It complements Python's dataclasses and isn't a validation library. For validation, combine it with other libraries."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python314-dacite-1.9.2-2.4.noarch.rpm"
RPM_HASH = "d363a9c3904ab4da9fd9936390e37bf143306cd61e567d2031387a7eb9a73a98f630fa93a6bb775ca4027b9120e195d93d161b13b57a259e1d1b25cc421ebe96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dacite \
python314-dacite \
python3dist-dacite"

RDEPENDS:${PN} += "python-abi"

inherit rpm
