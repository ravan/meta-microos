SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.10.21"

RPM_NAME = "python310-tools-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "5a70a1ea9a25992cf548498583bc9ff3246a1bfe5c2237b20aee92e0c636c9e7a59e995e735118bdc069cc7a083a8218a42e9417620b6851ae0ec753d59ea016"

RPROVIDES:${PN} += "python310-2to3 \
python310-demo \
python310-tools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python310-base"

inherit rpm
