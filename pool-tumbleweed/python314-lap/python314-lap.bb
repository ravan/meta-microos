SUMMARY = "Linear Assignment Problem solver (LAPJV/LAPMOD)"
DESCRIPTION = "Linear Assignment Problem solver (LAPJV/LAPMOD)."
LICENSE = "BSD-2-Clause"

PV = "0.5.13"

RPM_NAME = "python314-lap-0.5.13-1.5.aarch64.rpm"
RPM_HASH = "6fdbccb9542dd6e6f373c11a1cd89a7cef7d05c17fd537a55ffce0c7240330949e2579a68510bd07933091d91adeea97bb1cf2e2deea741ed4de8cf37facb3b0"

RPROVIDES:${PN} += "python3.14dist-lap \
python314-lap \
python3dist-lap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-numpy"

inherit rpm
