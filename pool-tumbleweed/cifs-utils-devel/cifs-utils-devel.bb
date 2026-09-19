SUMMARY = "Files needed for building plugins for cifs-utils"
DESCRIPTION = "The SMB/CIFS protocol is a standard file sharing protocol widely deployed \
on Microsoft Windows machines. This package contains the header file \
necessary for building ID mapping plugins for cifs-utils."
LICENSE = "GPL-3.0-or-later"

PV = "7.7"

RPM_NAME = "cifs-utils-devel-7.7-2.1.aarch64.rpm"
RPM_HASH = "8675bbd845f96eb54682e0a6c926b99882ea6f877afce9e69b7b3861b5c6c5deaf57819309b789780ca3cb54bc4c99c7c387653d50f1c9af2ebbbd30fa16ef8c"

RPROVIDES:${PN} += "cifs-utils-devel"

RDEPENDS:${PN} += ""

inherit rpm
