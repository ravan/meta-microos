SUMMARY = "Two utilities for exploring Renovate debug log files"
DESCRIPTION = "Two utilities for exploring Renovate debug log files: \
 \
The renovate-pretty-log-tui command provides a Terminal User Interface (TUI) \
for interacting with a Renovate debug log export. \
 \
The renovate-pretty-log provides a Terminal User Interface (TUI) for \
interacting with a Renovate debug log export."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "renovate-pretty-log-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "d6a1a03990434f2150eb63aea918c65595a5cf5283e164414d3f9ad4af3b222352345fd2afbc8e3134aab36b2a4f658f3a5882a65acc76f38779c120c780eac1"

RPROVIDES:${PN} += "renovate-pretty-log"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
