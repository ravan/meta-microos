SUMMARY = "A CLI tool for sr.ht"
DESCRIPTION = "hut is a CLI companion utility to interact with sr.ht."
LICENSE = "AGPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "hut-0.8.0-1.4.aarch64.rpm"
RPM_HASH = "49380afea73084d3cdc37fdf0248e3ad730841acd1477dc34a3f7c5658cf48184f585a9b1c7474da4f13ab25829dc0e22052f5fc79e2aaac0c267c7ee31fef03"

RPROVIDES:${PN} += "hut"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
