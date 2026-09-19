SUMMARY = "Top Like UI to Show Per-Process I/O Going on"
DESCRIPTION = "Linux has always been able to show how much I/O was going on (the bi \
and bo columns of the vmstat 1 command). \
 \
Iotop is a Python program with a UI similar to top to show on behalf of \
which process is the I/O going on."
LICENSE = "GPL-2.0-only"

PV = "0.6git.20230403"

RPM_NAME = "iotop-0.6git.20230403-3.5.aarch64.rpm"
RPM_HASH = "6909675b9e5db90bf80131ac56b42728eb8c0fa0a730dcac4e8ce7080fdd3797884cc874b36addae736e0db70e1b6959a0a3903c142678b8d59be2b3ad624b15"

RPROVIDES:${PN} += "iotop \
python3.13dist-iotop \
python3dist-iotop"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-curses"

inherit rpm
