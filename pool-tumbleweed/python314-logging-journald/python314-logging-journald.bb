SUMMARY = "Logging Handler For Sending Logs to journald"
DESCRIPTION = "Pure python logging handler for writing logs to the journald using native protocol"
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python314-logging-journald-0.6.11-1.5.noarch.rpm"
RPM_HASH = "0fc314e34866bd56cacf084484e538d325fedff611d35404fd12fca8449192d3516dcdca2e0728829b594e11b0be386a3f08e2a8ea5b2e995580cb1857603808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-logging-journald \
python314-logging-journald \
python3dist-logging-journald"

RDEPENDS:${PN} += "python-abi"

inherit rpm
