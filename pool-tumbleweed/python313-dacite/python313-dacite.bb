SUMMARY = "Simple creation of data classes from dictionaries"
DESCRIPTION = "Simplifies creating type-hinted data transfer objects (DTOs) from dictionaries, useful for data from HTTP requests or databases. It complements Python's dataclasses and isn't a validation library. For validation, combine it with other libraries."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "python313-dacite-1.9.2-2.4.noarch.rpm"
RPM_HASH = "1901419a61c3d5069d3d600648363a9a3e5b77a2f3ca8766aaec29834dc858886c11d5192b93fd47a6b680b28db8389a1778eea5ad66e681690912b02bbae5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dacite \
python3.13dist-dacite \
python313-dacite \
python3dist-dacite"

RDEPENDS:${PN} += "python-abi"

inherit rpm
