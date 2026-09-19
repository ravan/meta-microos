SUMMARY = "Strong cryptography support for PySNMP (SNMP library for Python)"
DESCRIPTION = "Strong cryptography support for PySNMP (SNMP library for Python)"
LICENSE = "BSD-2-Clause"

PV = "0.1.0"

RPM_NAME = "python314-pysnmpcrypto-0.1.0-1.5.noarch.rpm"
RPM_HASH = "edbfee29c5c7125380f7cb6a996f7dc58f6c70660c0373a32b6624b54b5e0ae9fba3659a3545205e20bd9f5a04ad4ccbf6d6aaafdeeeb723b6c17cac4b4b1bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysnmpcrypto \
python314-pysnmpcrypto \
python3dist-pysnmpcrypto"

RDEPENDS:${PN} += "python-abi \
python314-cryptography"

inherit rpm
