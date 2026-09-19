SUMMARY = "LibRHash Shared Library"
DESCRIPTION = "LibRHash is a professional, portable, thread-safe C library for \
computing a wide variety of hash sums, such as CRC32, MD4, MD5, SHA1, \
SHA256, SHA512, AICH, ED2K, Tiger, DC++ TTH, BitTorrent BTIH, GOST R \
34.11-94, RIPEMD-160 HAS-160, EDON-R, Whirlpool and Snefru. \
Hash sums are used to ensure and verify integrity of large volumes of \
data for a long-term storing or transferring."
LICENSE = "0BSD"

PV = "1.4.6"

RPM_NAME = "librhash1-1.4.6-2.3.aarch64.rpm"
RPM_HASH = "6136e4eb1df66444ce6afaa60e24d45d32f8f8356d88e9b728172f1024729b59c91f35f2c8ef16c6ff1bbe76270581f17fb9929da7590478d360a52dfc8b85aa"

RPROVIDES:${PN} += "librhash.so.1 \
librhash1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
