SUMMARY = "Delay Accounting Utilities"
DESCRIPTION = "Delay accounting allows the administrator to track the time an \
application spends waiting on disk I/O, swap I/O and CPU scheduling. \
This can help pin-point resource shortages in a system configuration."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "delayacct-utils-7.2.5-32.132.aarch64.rpm"
RPM_HASH = "341089da78c98c1e1818132d9990bb76c141666222f1d61532a9f63aa7aa7974af4030b49b063a46925deeb00da25bd8ce9fac822716eae5d9bb8a2381d796d7"

RPROVIDES:${PN} += "delayacct-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
