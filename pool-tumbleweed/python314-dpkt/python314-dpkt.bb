SUMMARY = "Packet creation and parsing module for Python"
DESCRIPTION = "A packet creation / parsing module for Python, with definitions for \
the basic TCP/IP protocols."
LICENSE = "BSD-3-Clause"

PV = "1.9.8"

RPM_NAME = "python314-dpkt-1.9.8-2.5.noarch.rpm"
RPM_HASH = "19ca4d8eb4cd6b488e153453f5c6ea048ab7ab2798354f71099c634c9f3b2db45f46f78e604e115491dce3f2f8ea668c5e68dbd6fd130016c0a04b386899bf67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dpkt \
python314-dpkt \
python3dist-dpkt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
