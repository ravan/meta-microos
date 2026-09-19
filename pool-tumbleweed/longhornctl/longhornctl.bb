SUMMARY = "CLI for the Longhorn cloud native distributed block storage"
DESCRIPTION = "longhornctl is a CLI (command-line interface) designed to simplify Longhorn \
manual operations. \
 \
What Can You Do With longhornctl? \
 \
* Install and verify prelight requirements. \
* Execute one-time Longhorn operations. \
* Gain inside into your Longhorn system."
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "longhornctl-1.10.0-1.8.aarch64.rpm"
RPM_HASH = "8e293534e07573bed67f29494226087bb2e4c661f72c598aa371b136b0a60e2db1335afe58d3b4d776a057ebbb3ef6b7eb8a808b7b2c921e1456fb4194b72fe4"

RPROVIDES:${PN} += "longhornctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
