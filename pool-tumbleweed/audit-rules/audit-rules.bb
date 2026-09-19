SUMMARY = "Rules and utilities for audit"
DESCRIPTION = "The audit rules package contains the rules and utilities to load audit rules."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "audit-rules-4.0.2-3.5.aarch64.rpm"
RPM_HASH = "d644059b59512037e2cb8881be519e38d4f66afe51dd0ede7ba1dc3a4f70855839a5d322b065023ab62a0a102075847cc4f7cd9d8c6715b8ace0ecd5685f3a4f"

RPROVIDES:${PN} += "audit-rules \
config-audit-rules"

RDEPENDS:${PN} += "/usr/bin/sh \
gawk \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libauparse.so.0 \
libc.so.6"

inherit rpm
