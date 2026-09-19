SUMMARY = "Python module adding smart card support"
DESCRIPTION = "Python-pyscard consists of smartcard.scard, an extension module wrapping \
Windows smart card base components (also known as PCSC) on Windows and PCSC \
lite on linux and Mac OS X Tiger and Leopard, and smartcard, a higher level \
python framework built on top of the raw PCSC API."
LICENSE = "LGPL-2.0-or-later"

PV = "2.3.1"

RPM_NAME = "python314-pyscard-2.3.1-1.7.aarch64.rpm"
RPM_HASH = "f81015744e9d8dd713f8d1b09fbef1eed97884666ce24791b9de1e721daa4beb2e84c7225c38edfbf6dacd5f69f945f3a2491e3ee4911e6e57287922129ea049"

RPROVIDES:${PN} += "python3.14dist-pyscard \
python314-pyscard \
python3dist-pyscard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-ccid \
python-abi"

inherit rpm
