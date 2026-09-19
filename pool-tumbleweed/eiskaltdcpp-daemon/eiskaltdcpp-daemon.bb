SUMMARY = "Daemon for eiskaltdcpp"
DESCRIPTION = "This package contains only the EiskaltDC++ daemon, without any GUI. \
Support for control via JSON-RPC is enabled. The EiskaltDC++ CLI and \
Web UI programs can be used to control it. \
EiskaltDC++ Qt and GTK+ UI may be used for configuring the \
EiskaltDC++ daemon (they use the same settings from core library), \
but they should not be launched simultaneously. \
EiskaltDC++ is a program that uses the Direct Connect and Advanced \
Direct Connect protocols. It is compatible with DC++, AirDC++, \
FlylinkDC++ and other DC clients. EiskaltDC++ also interoperates with \
all common DC hub software."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-daemon-2.4.2-6.2.aarch64.rpm"
RPM_HASH = "cc5d222ba821ea492aaca3407fe172607435a8f03d9c64cc1e0b1a48e75c358d39d9a3df583173c04044bcb2c4923289e8dba07eb440e3f9d2c54d5fb5d6a620"

RPROVIDES:${PN} += "eiskaltdcpp-daemon"

RDEPENDS:${PN} += "eiskaltdcpp-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeiskaltdcpp.so.2.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
