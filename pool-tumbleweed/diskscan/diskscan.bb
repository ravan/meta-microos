SUMMARY = "Scan disk for bad or near failure sectors"
DESCRIPTION = "DiskScan is a Unix/Linux tool to scan a block device and check \
if there are unreadable sectors, in addition it uses read \
latency times as an assessment for a near failure as sectors \
that are problematic to read usually entail many retries. This \
can be used to assess the state of the disk and maybe decide \
on a replacement in advance to its imminent failure. The disk \
self test may or may not pick up on such clues depending on \
the disk vendor decision making logic."
LICENSE = "GPL-3.0-or-later"

PV = "0.21"

RPM_NAME = "diskscan-0.21-2.3.aarch64.rpm"
RPM_HASH = "6fb6e590c501cf52aaa3565739857cf13a298b017e3c1dbd2f11736369689f440a1ec92347c75d662ea9d492422aa3b6beae65c474d99300951a9f1a64b2bbb9"

RPROVIDES:${PN} += "diskscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
