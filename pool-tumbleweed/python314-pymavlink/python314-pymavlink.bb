SUMMARY = "Python MAVLink code"
DESCRIPTION = "A Python library for handling MAVLink protocol streams and log files. \
This allows for the creation of simple scripts to analyse telemetry \
logs from autopilots such as ArduPilot which use the MAVLink protocol."
LICENSE = "LGPL-3.0-only"

PV = "2.4.41"

RPM_NAME = "python314-pymavlink-2.4.41-2.5.noarch.rpm"
RPM_HASH = "8f517a13ea98e4714ca6290d57aa480f80953f2ae515bad7cf584dcbfce9b6e2f42c1166c97d5ab8b70e82063846cc929bb132560b6502cfb53ec780d93728cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymavlink \
python314-pymavlink \
python3dist-pymavlink"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-lxml"

inherit rpm
