SUMMARY = "Network packet stream editor"
DESCRIPTION = "NetSED is a utility designed to alter the contents of packets forwarded through \
the network in real time."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "netsed-1.4-1.4.aarch64.rpm"
RPM_HASH = "358e53f060f2f2b6eb8a5814b0433afb39a97a139159b9883a42f20bfbe02619214b867ed63f9f6d26b16d55ef37ff00151a799295aac97002eaa9b9caf7b100"

RPROVIDES:${PN} += "netsed"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
