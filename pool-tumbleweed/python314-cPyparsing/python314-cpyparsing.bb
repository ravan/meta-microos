SUMMARY = "Cython implementation of PyParsing"
DESCRIPTION = "Cython implementation of PyParsing created for use in Coconut and Undebt."
LICENSE = "Apache-2.0"

PV = "2.4.7.2.4.3"

RPM_NAME = "python314-cPyparsing-2.4.7.2.4.3-1.6.aarch64.rpm"
RPM_HASH = "3145e724a8229a258fb67e3fb4eff21aeeb8b91222bc44b0113352654e74c290b7a0e91871711974f0f3953aba721c16cec33529af128463226bb2eec31d7522"

RPROVIDES:${PN} += "python3.14dist-cpyparsing \
python314-cPyparsing \
python3dist-cpyparsing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
