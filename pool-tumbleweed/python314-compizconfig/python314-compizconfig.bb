SUMMARY = "Python bindings for libraries for compizconfig-settings"
DESCRIPTION = "Python bindings for libraries/plugins for compizconfig-settings."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python314-compizconfig-0.8.18-2.34.aarch64.rpm"
RPM_HASH = "2e70386bde44c76b61ad50960be4fb6e7e57292beab0843cbb46529ce7779aa9df0cc6e98dec55e1309f5d639d0fb298607b617392d5c5a1e60a429d37e1e6b3"

RPROVIDES:${PN} += "python314-compizconfig"

RDEPENDS:${PN} += "compiz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcompizconfig.so.0 \
python-abi"

inherit rpm
