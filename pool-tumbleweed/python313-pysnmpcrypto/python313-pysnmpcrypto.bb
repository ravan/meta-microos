SUMMARY = "Strong cryptography support for PySNMP (SNMP library for Python)"
DESCRIPTION = "Strong cryptography support for PySNMP (SNMP library for Python)"
LICENSE = "BSD-2-Clause"

PV = "0.1.0"

RPM_NAME = "python313-pysnmpcrypto-0.1.0-1.5.noarch.rpm"
RPM_HASH = "29ea641158434bba88b2906fcfcbeffc555d55625bec5b1ed73054d9a4dcc252f17538950480e9b683e01376463fc04d1d377746bcf381a255d939c2502766be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysnmpcrypto \
python3.13dist-pysnmpcrypto \
python313-pysnmpcrypto \
python3dist-pysnmpcrypto"

RDEPENDS:${PN} += "python-abi \
python313-cryptography"

inherit rpm
