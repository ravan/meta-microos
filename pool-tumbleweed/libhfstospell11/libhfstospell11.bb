SUMMARY = "HFST spell checker runtime libraries"
DESCRIPTION = "HFST spell checker Runtime libraries for hfst-ospell"
LICENSE = "Apache-2.0"

PV = "0.5.4"

RPM_NAME = "libhfstospell11-0.5.4-1.12.aarch64.rpm"
RPM_HASH = "5feb92ee35a0c238adbb221d40089ea20984de2690cffa083794aed77681d1b77ba19e1a48101251b64a18645090f41bfce983ae374210a37411d08ad52caf02"

RPROVIDES:${PN} += "libhfstospell \
libhfstospell.so.11 \
libhfstospell11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
