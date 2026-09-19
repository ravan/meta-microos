SUMMARY = "Provider of IANA time zone data"
DESCRIPTION = "Provider of IANA time zone data"
LICENSE = "Apache-2.0"

PV = "2026.2"

RPM_NAME = "python314-tzdata-2026.2-1.2.noarch.rpm"
RPM_HASH = "ad0aeed7917e11c48c19de44ecf3ee405772b3ed4412923be1675b2496e842307fda07ae55572d3396500a6a8c118268747cc88ed1c0f2b0b4bb99660e7fdda3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tzdata \
python314-tzdata \
python3dist-tzdata"

RDEPENDS:${PN} += "python-abi"

inherit rpm
