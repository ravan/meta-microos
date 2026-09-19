SUMMARY = "Library with helpers for the jsonlines file format"
DESCRIPTION = "Python library to simplify working with jsonlines_ and ndjson_ data."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "python313-jsonlines-4.0.0-2.5.noarch.rpm"
RPM_HASH = "ae58b3c0afb8a9b3af8013fb748c526d752f506517318bbf1656b45284f414220fbff0208136371a61baa5bc945fb931ac41e7d38430eebdaaa56a9b9bffaa68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonlines \
python3.13dist-jsonlines \
python313-jsonlines \
python3dist-jsonlines"

RDEPENDS:${PN} += "python-abi \
python313-attrs"

inherit rpm
