SUMMARY = "Example bpftrace scripts and other useful snippets"
DESCRIPTION = "Collection of tools for quick instrumentation and inspection of a running \
system. These are all BPFtrace scripts within /usr/share/bpftrace, and can be \
easily modified to allow for different types of debugging."
LICENSE = "Apache-2.0"

PV = "0.27.0"

RPM_NAME = "bpftrace-tools-0.27.0-1.1.noarch.rpm"
RPM_HASH = "f16916a6845f2d966f8371b2e166f85ce8417dae2dbf1a6bc537af1ea923b430e3cffdcf9f86fd9c626f94c10842895fd283a009a7ce517730da8e701e505234"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bpftrace-tools"

RDEPENDS:${PN} += "/usr/bin/bpftrace \
bpftrace"

inherit rpm
