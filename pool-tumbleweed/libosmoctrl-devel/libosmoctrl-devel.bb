SUMMARY = "Osmocom control interface library"
DESCRIPTION = "libosmoctrl is an SNMP-like control interface. In contrast to the VTY \
interface, the control interface is meant to be used by programs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmoctrl."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmoctrl-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "1e75680533d1e4e6768c3badcea45bcc503bf86289de9debcf4be2ea88924c074bddc0059bd510c25283466f927564f209f816d52d89398b0f814726442637e4"

RPROVIDES:${PN} += "libosmoctrl-devel \
pkgconfig-libosmoctrl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmoctrl0 \
libosmovty-devel \
pkgconfig-libosmocore \
pkgconfig-libosmogsm \
pkgconfig-talloc"

inherit rpm
