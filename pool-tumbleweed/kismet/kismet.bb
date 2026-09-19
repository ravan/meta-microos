SUMMARY = "An 802.11 Wireless Network Sniffer"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
Kismet works with Wi-Fi interfaces, Bluetooth interfaces, some \
SDR (software defined radio) hardware like the RTLSDR, and other \
specialized capture hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "67ebec1dfb2708041a7e56bc85787086dc8742072df5dd60dac5be06af745741993cc36da2d1aff963e5bf83df15285bd4eab65830b7dea1e793f18f20dca4f9"

RPROVIDES:${PN} += "config-kismet \
kismet"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kismet \
kismet-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libmosquitto.so.1 \
libpcap.so.1 \
libpcre2-8.so.0 \
libsensors.so.4 \
libsqlite3.so.0 \
libstdc++.so.6 \
libwebsockets.so.22 \
libz.so.1 \
permissions \
shadow \
user-kismet"

inherit rpm
