SUMMARY = "BroadVoice 16 development files"
DESCRIPTION = "Header files for the libbv16 library."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "broadvoice16-devel-1.2-4.9.aarch64.rpm"
RPM_HASH = "0acd0c6844151b811dca10bc2719ea7ce21787171a7ac7c3d9627dd060f20ee767f333c96e326cfd0de315913a152116a44d16e00b3ca066c28b3556fad8ab09"

RPROVIDES:${PN} += "broadvoice16-devel"

RDEPENDS:${PN} += "broadvoice16"

inherit rpm
