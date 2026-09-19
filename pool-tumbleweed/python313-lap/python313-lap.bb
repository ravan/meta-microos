SUMMARY = "Linear Assignment Problem solver (LAPJV/LAPMOD)"
DESCRIPTION = "Linear Assignment Problem solver (LAPJV/LAPMOD)."
LICENSE = "BSD-2-Clause"

PV = "0.5.13"

RPM_NAME = "python313-lap-0.5.13-1.5.aarch64.rpm"
RPM_HASH = "fd3c384b118c4268f4bf7a9e4c9597a13faab24ebd7fa37714c3cf9ed821cc79caadc1b249f8fb61abeb0a16e4e8fefd24c79e6a6b252c15e97ac49f25bb8cbc"

RPROVIDES:${PN} += "python3-lap \
python3.13dist-lap \
python313-lap \
python3dist-lap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-numpy"

inherit rpm
