SUMMARY = "OwnTracks command line interface publisher"
DESCRIPTION = "This is the OwnTracks command line interface publisher, a.k.a. \
ocli, a small utility which connects to gpsd and publishes position \
information in OwnTracks JSON to an MQTT broker in order for \
compatible software to process location data."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.0"

RPM_NAME = "ocli-0.9.0-6.13.aarch64.rpm"
RPM_HASH = "ec0699dcbf1e4be6d53df01094d4e38e04836751a8dc8ea469000b0096e0286abcd42246dd6aedfe41d19639ee7e939505579718074cc43d8e61414dec344d09"

RPROVIDES:${PN} += "ocli \
owntracks-cli-publisher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgps.so.32 \
libmosquitto.so.1"

inherit rpm
