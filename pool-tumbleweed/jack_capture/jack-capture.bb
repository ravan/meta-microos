SUMMARY = "A small program to jack"
DESCRIPTION = "jack_capture is a small program to capture whatever \
sound is going out to your speakers into a file."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.73"

RPM_NAME = "jack_capture-0.9.73-2.12.aarch64.rpm"
RPM_HASH = "c27ffe345a51b19f036d727960327ea0ff82a1067c3b22333fb851ab3a6556f6235e3dee9b4960404f7ad1d6cc2ae2bb5fdd9aaa71fca1e8e5ebb98152681b4a"

RPROVIDES:${PN} += "jack-capture"

RDEPENDS:${PN} += "libc.so.6 \
libjack.so.0 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
