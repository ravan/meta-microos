SUMMARY = "Tools for Converting from and to the Tagged Image File Format"
DESCRIPTION = "This package contains the library and support programs for the TIFF \
image format."
LICENSE = "HPND"

PV = "4.7.2"

RPM_NAME = "tiff-4.7.2-1.2.aarch64.rpm"
RPM_HASH = "673b607984320adf6dc0ea329e777206f6da7955cd89f1711a24591c5b5f347677c7264285107dc187a71dbecbc2b766ef4e525da7c810fbacbd55e6200c1775"

RPROVIDES:${PN} += "tiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtiff.so.6"

inherit rpm
