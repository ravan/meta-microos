SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.13.14"

RPM_NAME = "python313-tools-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "2e2c56c8b6b6445ec8f24256723b00f5db06cb5185103d73a2bda6d9afa04c60b5150f40261dfa55c9640a18513a30a891c789b9c6c338d2111ec81bf7b94834"

RPROVIDES:${PN} += "python3-demo \
python3-tools \
python313-demo \
python313-tools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-base"

inherit rpm
