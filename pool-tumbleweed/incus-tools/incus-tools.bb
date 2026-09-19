SUMMARY = "Optional extra tools for incus"
DESCRIPTION = "Extra tools to help with the administration of Incus. This includes helpers for \
migrating from LXD to Incus as well as a smattering of other helpers that can \
be helpful for some users but are not necessary for most Incus deployments \
(such as benchmarking tools and tools for managing simplestreams Incus image \
servers)."
LICENSE = "Apache-2.0"

PV = "7.4"

RPM_NAME = "incus-tools-7.4-1.1.aarch64.rpm"
RPM_HASH = "80e4dd260a7a24c02125fce845738131ef9a7f211e7559128d47ff9737834d5c232310e108c8639f5e0263ffd03cec5a7da035cb408e6dcd1a799bfb6a2f9f06"

RPROVIDES:${PN} += "incus-tools"

RDEPENDS:${PN} += "incus \
libacl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblxc.so.1 \
libsqlite3.so.0"

inherit rpm
