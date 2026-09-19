SUMMARY = "Commandline utilities for access to MTP Players"
DESCRIPTION = "This package contains binaries that allow command line access to USB \
based media players based on the MTP (Media Transfer Protocol) authored \
by Microsoft. For graphical user interfaces use Amarok or Banshee."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.23"

RPM_NAME = "mtp-tools-1.1.23-1.3.aarch64.rpm"
RPM_HASH = "257d4236351e2dd1f51dcf3037f1595121ee065a49d621c00e43f8c3f9cfddc0dc79e7d4b7376912fa3bb323c0049f80ffe335378c2b38bc0fa212ff305fa506"

RPROVIDES:${PN} += "mtp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmtp.so.9"

inherit rpm
