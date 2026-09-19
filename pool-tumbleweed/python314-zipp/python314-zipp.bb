SUMMARY = "Pathlib-compatible object wrapper for zip files"
DESCRIPTION = "A pathlib-compatible Zipfile object wrapper."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python314-zipp-4.1.0-1.2.noarch.rpm"
RPM_HASH = "6b10ff334bb2d94725c478a26b82e8a445f8799a85e6e51c8ef115fda336295ac432e3746b3c7fe2c91e874dba1aeb36c8a057c195cb51655185efb5fc83f5a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zipp \
python314-zipp \
python3dist-zipp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
