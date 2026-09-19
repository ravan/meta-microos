SUMMARY = "Python plugin support for trace-cmd"
DESCRIPTION = "Python plugin support for trace-cmd"
LICENSE = "GPL-2.0-only"

PV = "3.4"

RPM_NAME = "trace-cmd-python3-3.4-1.2.aarch64.rpm"
RPM_HASH = "29a88acd65cddfdf0160a6f947d18720804c59201b31b478f6aaccabd90e442c61b4b4ce62662b81b775a03719190d96cde1e89213fbf73f38ce8f8880194108"

RPROVIDES:${PN} += "trace-cmd-python \
trace-cmd-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
python-abi \
python3 \
trace-cmd"

inherit rpm
