SUMMARY = "A malware identification and classification tool"
DESCRIPTION = "YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.5.5"

RPM_NAME = "yara-4.5.5-1.4.aarch64.rpm"
RPM_HASH = "d61e51ffb0f7d97576ab035c77e77553a6874e9a4e4d15e6c93e6cfd5e806861a19688c52544675da29409d5a2d4cf695d87229022bbc0c0dfdf0376e70af5cf"

RPROVIDES:${PN} += "yara"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libm.so.6 \
libmagic.so.1 \
libyara.so.10"

inherit rpm
