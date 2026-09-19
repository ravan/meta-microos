SUMMARY = "Data-Driven/Decorated Tests"
DESCRIPTION = "A library to multiply test cases."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "python313-ddt-1.7.2-2.5.noarch.rpm"
RPM_HASH = "e6ff360a8250bf3486898e546cd493d12d41e144822280e52966d7792acfd3f3ebb02bf93ec20cfe2b023410257eac9478fc342372792c4d962185fc88656427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ddt \
python3.13dist-ddt \
python313-ddt \
python3dist-ddt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
