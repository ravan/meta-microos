SUMMARY = "A Trusted Execution Environment client"
DESCRIPTION = "This component provides the TEE Client API as defined by the \
GlobalPlatform TEE standard. For a general overview of OP-TEE, the \
Open Platform Trusted Execution Environment, see the Notice.md file."
LICENSE = "BSD-2-Clause"

PV = "4.6.0"

RPM_NAME = "optee-client-4.6.0-1.6.aarch64.rpm"
RPM_HASH = "906d8b1cf38907393011af7700e53ae84244eb8290e46f8ec17c47f8eed065f7a6477eee1f4d3ccaaec41cf16def729e03d42b56839a8b7ba8f810e5abb30208"

RPROVIDES:${PN} += "optee-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libteec.so.2 \
systemd"

inherit rpm
