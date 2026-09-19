SUMMARY = "vSphere CLI built on top of govmomi"
DESCRIPTION = "The CLI is designed to be a user friendly CLI alternative to the GUI and well \
suited for automation tasks. It also acts as a test harness for the govmomi \
APIs and provides working examples of how to use the APIs."
LICENSE = "Apache-2.0"

PV = "0.56.0"

RPM_NAME = "govc-0.56.0-1.1.aarch64.rpm"
RPM_HASH = "3c69d088a2c8691954a010f18b3f26c34687b3e95f6ba621530a8e76d9ded4f84331653196289728b5780e8057603b1e1eb523f12fbcd7ff11f472243126d2ba"

RPROVIDES:${PN} += "govc"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
