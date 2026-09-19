SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.14.7"

RPM_NAME = "python314-tools-3.14.7-1.3.aarch64.rpm"
RPM_HASH = "3cea8e8a24ea387bc7cfcc55185ac1f16d9af3d61962d5b318deaab8a37a2c9232ac595bde98c6319071e20edc0867cb870a50897846a902a7e8a99b2094d331"

RPROVIDES:${PN} += "python314-demo \
python314-tools"

RDEPENDS:${PN} += "python-abi \
python314-base"

inherit rpm
