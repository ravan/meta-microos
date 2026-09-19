SUMMARY = "Library implementing TEE Client API"
DESCRIPTION = "This component provides the TEE Client API as defined by the \
GlobalPlatform TEE standard. For a general overview of OP-TEE, the \
Open Platform Trusted Execution Environment, see the Notice.md file."
LICENSE = "BSD-2-Clause"

PV = "4.6.0"

RPM_NAME = "libteec2-4.6.0-1.6.aarch64.rpm"
RPM_HASH = "d17378cc4194a234f0aaf1d6ce32a4a3be5d376327be8639278ec9ae0d9c6a116f636a5f56635fb5695e0c72b967743a6660c332462c084dcccebbc20dec2ba0"

RPROVIDES:${PN} += "libteec.so.2 \
libteec2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
