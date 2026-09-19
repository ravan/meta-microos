SUMMARY = "A pure Python Levenshtein implementation"
DESCRIPTION = "A pure Python Levenshtein implementation."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python313-pylev-1.4.0-3.5.noarch.rpm"
RPM_HASH = "be59a7b9302c86649a237a781da8037f8dce934c49aa3ffc897f687f7e2bd7da5316ba9544458bd48e905defba75c95cf0717202409ba29d9164e6e6ee4a9176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylev \
python3.13dist-pylev \
python313-pylev \
python3dist-pylev"

RDEPENDS:${PN} += "python-abi"

inherit rpm
