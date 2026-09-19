SUMMARY = "Common Icinga 2 configuration"
DESCRIPTION = "This subpackage provides common directories, and the UID and GUID definitions \
among Icinga 2 related packages."
LICENSE = "GPL-3.0-or-later"

PV = "2.16.5"

RPM_NAME = "icinga2-common-2.16.5-1.2.aarch64.rpm"
RPM_HASH = "3850a697a891b2efbb7a3762241320aeb54d587955ccaadab74e2117ffb0552c8d868ccfb5604602b68fe418e13c130b709c280626fc97d48a37b7b46c5f1553"

RPROVIDES:${PN} += "group-icinga \
group-icingacmd \
icinga2-common \
user-icinga"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
monitoring-plugins-common \
permissions \
shadow"

inherit rpm
