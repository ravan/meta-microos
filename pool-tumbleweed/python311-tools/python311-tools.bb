SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.11.16"

RPM_NAME = "python311-tools-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "28a11843958a43af19115937407f4c623bf8cfe4f09efcaad407e085a4df0a08c4f15fc5ac4b3afd755ad1a468329dc377f256cfa7c5d5ec849e92440a273551"

RPROVIDES:${PN} += "python311-2to3 \
python311-demo \
python311-tools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python311-base"

inherit rpm
