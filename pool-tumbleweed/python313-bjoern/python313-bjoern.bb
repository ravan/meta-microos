SUMMARY = "A screamingly fast Python 2 + 3 WSGI server written in C"
DESCRIPTION = "A screamingly fast Python 2 + 3 WSGI server written in C."
LICENSE = "BSD-2-Clause"

PV = "3.2.2"

RPM_NAME = "python313-bjoern-3.2.2-2.7.aarch64.rpm"
RPM_HASH = "98634606bba5944c09a5a9181dcfbfe04e182044e7c152e61bd44d63c51cb5ae05e3050ae55e4aa359f63bcfcb7c20f4fff59882ffec8789cfa0cf90efe89d57"

RPROVIDES:${PN} += "python3-bjoern \
python3.13dist-bjoern \
python313-bjoern \
python3dist-bjoern"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
python-abi"

inherit rpm
