SUMMARY = "Google Cloud Guest Agent"
DESCRIPTION = "Google Cloud OSConfig Agent"
LICENSE = "Apache-2.0"

PV = "20260908.00"

RPM_NAME = "google-osconfig-agent-20260908.00-2.1.aarch64.rpm"
RPM_HASH = "b77ef721fe4cd43ca0d6245e4554564564d2f3f749fc00e7a921a99f4a55cfe3cb8f6d355f167150ed8ae67716dfee0a5c5ad72696dec934777f5e07980ca7a0"

RPROVIDES:${PN} += "google-osconfig-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
google-guest-configs \
libc.so.6"

inherit rpm
