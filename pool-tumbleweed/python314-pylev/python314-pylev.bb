SUMMARY = "A pure Python Levenshtein implementation"
DESCRIPTION = "A pure Python Levenshtein implementation."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python314-pylev-1.4.0-3.5.noarch.rpm"
RPM_HASH = "4d5f0b0bc2f69da4a3d02f3287b8a8d2262ae2d87c5c7938c57932aae21e7e82f5163154675986e9367f029c21ea6f65654d52a092907d22fbfba74e2e9deddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylev \
python314-pylev \
python3dist-pylev"

RDEPENDS:${PN} += "python-abi"

inherit rpm
