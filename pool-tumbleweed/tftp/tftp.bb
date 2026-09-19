SUMMARY = "Trivial File Transfer Protocol (TFTP)"
DESCRIPTION = "The Trivial File Transfer Protocol (TFTP) is normally used only for \
booting diskless workstations and for getting or saving network \
component configuration files."
LICENSE = "BSD-3-Clause"

PV = "5.3"

RPM_NAME = "tftp-5.3-1.2.aarch64.rpm"
RPM_HASH = "15146dfa25dfb0f8cfbb0ba63ccc50a1d05ba28643bf78411c7723102e8d12a1c8998e4338106bb4f69ddfe0b2dc0f61ae77a46f603f4822c6f9e5710de46bf1"

RPROVIDES:${PN} += "tftp \
tftp-client \
tftp-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
libwrap.so.0 \
netcfg \
user-tftp"

inherit rpm
