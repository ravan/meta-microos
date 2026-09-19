SUMMARY = "Logging Handler For Sending Logs to journald"
DESCRIPTION = "Pure python logging handler for writing logs to the journald using native protocol"
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python313-logging-journald-0.6.11-1.5.noarch.rpm"
RPM_HASH = "1f35682804b2c5323b856559ee1e310830db346f7be03b968b73e0493daf894631e10c92c5dcadf3f2aaac0c458b0c381c4640f08c2e968dee2e6bdb5696aba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logging-journald \
python3.13dist-logging-journald \
python313-logging-journald \
python3dist-logging-journald"

RDEPENDS:${PN} += "python-abi"

inherit rpm
