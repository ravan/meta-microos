SUMMARY = "Safe Cleanup Blocks"
DESCRIPTION = "This module implements so-called 'guards'. A guard is something (usually an \
object) that 'guards' a resource, ensuring that it is cleaned up when \
expected. \
 \
Specifically, this module supports two different types of guards: guard \
objects, which execute a given code block when destroyed, and scoped \
guards, which are tied to the scope exit."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.023"

RPM_NAME = "perl-Guard-1.023-1.54.aarch64.rpm"
RPM_HASH = "421e96146d19eb9153004314cd71b69233c2c7a3031298ff374479f8e70ff7abc03b5b88f49a05c9eea1c82671e716f3cd0ee7c95ec77f7765325c3a3761b913"

RPROVIDES:${PN} += "perl-Guard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
