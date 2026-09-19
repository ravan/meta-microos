SUMMARY = "Documentation for Crash"
DESCRIPTION = "This subpackage contains the crash whitepaper from Dave Anderson. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GFDL-1.2-only"

PV = "9.0.2"

RPM_NAME = "crash-doc-9.0.2-1.6.aarch64.rpm"
RPM_HASH = "ac2c71d82d0ce1694a2ae1eade4d224854cc41cf2f19cfc29375c85a668c4f668efa5199015a6a0b57464e53c3cde35188e26f9c28dc8ce1eec8337af3db8314"

RPROVIDES:${PN} += "crash-doc"

RDEPENDS:${PN} += "crash"

inherit rpm
