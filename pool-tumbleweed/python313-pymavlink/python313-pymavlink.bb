SUMMARY = "Python MAVLink code"
DESCRIPTION = "A Python library for handling MAVLink protocol streams and log files. \
This allows for the creation of simple scripts to analyse telemetry \
logs from autopilots such as ArduPilot which use the MAVLink protocol."
LICENSE = "LGPL-3.0-only"

PV = "2.4.41"

RPM_NAME = "python313-pymavlink-2.4.41-2.5.noarch.rpm"
RPM_HASH = "d93484df189ee737c1a662566ce20a6e55843d98b9f0cc650896fee6f621139e1870568488e451f286954433506a432cf4ea1526b7d5189dbdbe046538bc84fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymavlink \
python3.13dist-pymavlink \
python313-pymavlink \
python3dist-pymavlink"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-lxml"

inherit rpm
