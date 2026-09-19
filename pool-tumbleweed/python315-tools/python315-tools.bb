SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "python315-tools-3.15.0~rc2-1.2.aarch64.rpm"
RPM_HASH = "efa85e576a745ea96633722f7ba5118ffcf3747a2f6636dd179482b0e67b400d63cdcc6b3a8a8fa50caef6f7d27a0a2712d138cfaf940fcabbbd3649f055e2b7"

RPROVIDES:${PN} += "python315-demo \
python315-tools"

RDEPENDS:${PN} += "python-abi \
python315-base"

inherit rpm
