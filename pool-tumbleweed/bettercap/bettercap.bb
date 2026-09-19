SUMMARY = "Swiss army knife for network attacks and monitoring"
DESCRIPTION = "The Swiss Army knife for WiFi, Bluetooth Low Energy, wireless HID hijacking and \
Ethernet networks reconnaissance and MITM attacks."
LICENSE = "GPL-3.0-or-later"

PV = "2.41.7"

RPM_NAME = "bettercap-2.41.7-1.4.aarch64.rpm"
RPM_HASH = "86be1f015423d5cd16bc69b506b59b3da60d5d264b4f532fd964658561062ca223f688bba0627b0c527d7d93d737229fad78c5643d69831775dbfad4b59ad1d4"

RPROVIDES:${PN} += "bettercap"

RDEPENDS:${PN} += "/usr/bin/sh \
libnetfilter-queue1 \
systemd"

inherit rpm
