SUMMARY = "Logitech Unifying Receiver configuration library"
DESCRIPTION = "A library to configure and handle the /dev hidraw devices belonging \
to the 'Unifying' wireless receiver."
LICENSE = "MIT"

PV = "0.18"

RPM_NAME = "liblur3-0.18-2.5.aarch64.rpm"
RPM_HASH = "d4639002fecd11bbeb46bef7de1be2f653fd1d19d063a24b4ec3c57aaf5521870f18bb2ced52b0b17d932814775c2eca13e4691f20d64201f41fc153fbfd582f"

RPROVIDES:${PN} += "liblur.so.3 \
liblur3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
