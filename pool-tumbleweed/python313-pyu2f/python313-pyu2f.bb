SUMMARY = "U2F host library for interacting with a U2F device over USB"
DESCRIPTION = "U2F host library for interacting with a U2F device over USB."
LICENSE = "Apache-2.0"

PV = "0.1.5a"

RPM_NAME = "python313-pyu2f-0.1.5a-7.5.noarch.rpm"
RPM_HASH = "7c3579ce74c17d234a0b9786c4e94031b56c56c4395df677c3f49b4f5ba6a72c7795649312e5d3ca9067977afc29e1898c97916320dfe895dd321b274dcc05e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyu2f \
python3.13dist-pyu2f \
python313-pyu2f \
python3dist-pyu2f"

RDEPENDS:${PN} += "python-abi"

inherit rpm
