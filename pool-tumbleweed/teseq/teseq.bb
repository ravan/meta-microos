SUMMARY = "A tool for control characters and terminal control sequences"
DESCRIPTION = "Teseq is a tool for analyzing files that contain control characters and \
terminal control sequences, by printing these control sequences and their \
meanings in readable English. It is intended to be useful for debugging \
terminal emulators, and programs that make heavy use of advanced terminal \
features such as cursor movement, coloring, and other effects."
LICENSE = "GPL-3.0+"

PV = "1.1.1"

RPM_NAME = "teseq-1.1.1-1.37.aarch64.rpm"
RPM_HASH = "52ed7ef5dd114c49c732256e3207eb72ea6a51f7e7f61c387230af707c4df552a105bf3cfe1fe7cbdee04f7d87cc794dca703b0bdf45b0c33a5c0dcbbae3980f"

RPROVIDES:${PN} += "teseq"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
