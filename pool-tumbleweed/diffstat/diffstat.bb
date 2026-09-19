SUMMARY = "Utility That Provides Statistics Based on the Output of diff"
DESCRIPTION = "diffstat reads the output of the diff command and displays a histogram \
of the insertions, deletions, and modifications in each file."
LICENSE = "MIT"

PV = "1.69"

RPM_NAME = "diffstat-1.69-1.3.aarch64.rpm"
RPM_HASH = "581bb1215a397f97d7ff104cc85c4145a7aeebcd9241b1575a64ddcaa35bf50565ab0c9527204e1e460674bf72655373ad52166265ed6bfa91b3ac22b454d2b3"

RPROVIDES:${PN} += "diffstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
