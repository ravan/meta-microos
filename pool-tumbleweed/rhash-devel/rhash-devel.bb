SUMMARY = "Headers and Static Library for LibRHash"
DESCRIPTION = "LibRHash is a professional, portable, thread-safe C library for \
computing a wide variety of hash sums, such as CRC32, MD4, MD5, SHA1, \
SHA256, SHA512, AICH, ED2K, Tiger, DC++ TTH, BitTorrent BTIH, GOST R \
34.11-94, RIPEMD-160 HAS-160, EDON-R, Whirlpool and Snefru. \
Hash sums are used to ensure and verify integrity of large volumes of \
data for a long-term storing or transferring. \
 \
This package includes LibRHash development files."
LICENSE = "0BSD"

PV = "1.4.6"

RPM_NAME = "rhash-devel-1.4.6-2.3.aarch64.rpm"
RPM_HASH = "9de48822c9d1a093aff59a666c5b001f1a0c21a430395cc58a71702b0095a8e571b5e03b250e212803dc9ec3aac50955246ff09d535c247201c1130f75cbdb85"

RPROVIDES:${PN} += "librhash-devel \
rhash-devel"

RDEPENDS:${PN} += "librhash1"

inherit rpm
