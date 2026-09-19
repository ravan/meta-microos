SUMMARY = "TIST plugin for connman"
DESCRIPTION = "Provides TI Shared Transport support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-plugin-tist-1.42-2.16.aarch64.rpm"
RPM_HASH = "859b55ce865219fc500bdc7f0079b45015b39099c713cfef5c2dd0c95f2613596ac73884a1c847981d8e84c35abb18af20d883ef97460cd729bd41dae22f232a"

RPROVIDES:${PN} += "connman-plugin-tist"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
