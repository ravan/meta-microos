SUMMARY = "GNUnet library libgnunettestingtestbed"
DESCRIPTION = "This package contains the libgnunettestingtestbed library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunettestingtestbed0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "488f1c82d57b867a6b54f394b0c3fd889e25ba983f31a3acd519a8736576d563b2de514e790289ee09b3f86ce215c5bc5ed46f026fe0a792ea07b497ac218d43"

RPROVIDES:${PN} += "libgnunettestingtestbed.so.0 \
libgnunettestingtestbed0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunettestbed.so.0 \
libgnunettesting.so.3 \
libgnunetutil.so.20"

inherit rpm
