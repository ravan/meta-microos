SUMMARY = "Recursive Hasher"
DESCRIPTION = "RHash (Recurcive Hasher) is a console utility for computing and \
verifying magnet links and hash sums of files. \
It supports CRC32, MD4, MD5, SHA1/SHA2, Tiger, DC++ TTH, BitTorrent \
BTIH, AICH, eDonkey hash, GOST R 34.11-94, RIPEMD-160, HAS-160, EDON-R, \
Whirlpool and Snefru hash algorithms. Hash sums are used to ensure and \
verify integrity of large volumes of data for a long-term storing or \
transferring. \
 \
Program features: \
 * Calculation of Magnet links and EDonkey 2000 links. \
 * Output in a predefined (SFV, BSD-like) or a user-defined format. \
 * Updating crc files (adding hash sums of files missing in the crc \
   file). \
 * Ability to process directories recursively."
LICENSE = "0BSD"

PV = "1.4.6"

RPM_NAME = "rhash-1.4.6-2.3.aarch64.rpm"
RPM_HASH = "7424b23726ef8815f44a6a96482d350a08a6a95bba65e4c639558158dca19e6abd00dbd86777ef877c9ac4a111652c8dda39119b655db665b4b9e559d2285563"

RPROVIDES:${PN} += "config-rhash \
rhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librhash.so.1"

inherit rpm
