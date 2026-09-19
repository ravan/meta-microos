SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.12.14"

RPM_NAME = "python312-tools-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "f5cefcb1091cd9364530ec4912b5eace5eea5417bf1e2b3b7fcc328901fa5e7feb5cd02add3b030882bb4331170f78dbc23a64774efe8cc81c999a9aa9a716d6"

RPROVIDES:${PN} += "python312-2to3 \
python312-demo \
python312-tools"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
python-abi \
python312-base"

inherit rpm
