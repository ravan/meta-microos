SUMMARY = "LTS Port of Python audioop"
DESCRIPTION = "LTS Port of Python audioop"
LICENSE = "PSF-2.0"

PV = "0.2.2"

RPM_NAME = "python314-audioop-lts-0.2.2-2.6.aarch64.rpm"
RPM_HASH = "70a4832cea1537ab085f576bdf0468c089a335a48d1df322c99286e414d37e8930f0777c19c4b74bfa42b6d259821b406c82b6b98c0f9baf6745f26f74c19b27"

RPROVIDES:${PN} += "python3.14dist-audioop-lts \
python314-audioop-lts \
python3dist-audioop-lts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
