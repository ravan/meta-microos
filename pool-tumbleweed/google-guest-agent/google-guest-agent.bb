SUMMARY = "Google Cloud Guest Agent"
DESCRIPTION = "Google Cloud Guest Agent"
LICENSE = "Apache-2.0"

PV = "20260903.01"

RPM_NAME = "google-guest-agent-20260903.01-1.1.aarch64.rpm"
RPM_HASH = "94d24772d5f251c5c124b5f90ed42d97bf7ca804ce0f750b38755d34e24e3926bc2c8d1ce4a8aebfb9fb028935a9789797e819bbf0e48f9b75fa62cd90d24388"

RPROVIDES:${PN} += "google-compute-engine-init \
google-guest-agent"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
google-guest-configs \
google-guest-oslogin \
libc.so.6"

inherit rpm
