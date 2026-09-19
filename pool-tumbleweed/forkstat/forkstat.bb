SUMMARY = "Process fork/exec/exit monitoring tool"
DESCRIPTION = "Forkstat monitors process fork(), exec() and exit() activity. It is useful for \
monitoring system behaviour and to track down rogue processes that are spawning \
off processes and potentially abusing the system."
LICENSE = "GPL-2.0-or-later"

PV = "0.04.00"

RPM_NAME = "forkstat-0.04.00-1.3.aarch64.rpm"
RPM_HASH = "381b202cf0d03df6d7902f67abf82560f72f6f01a775bba4332138c6189fff91ab52be60c638a7fd62b0b4ab7311d7112a6efa44e8cebe53545e784ab4df5636"

RPROVIDES:${PN} += "forkstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
