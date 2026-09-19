SUMMARY = "Keyed-Hashing for Message Authentication"
DESCRIPTION = "HMAC is used for message integrity checks between two parties that share a \
secret key, and works in combination with some other Digest algorithm, \
usually MD5 or SHA-1. The HMAC mechanism is described in RFC 2104. \
 \
HMAC follow the common 'Digest::' interface, but the constructor takes the \
secret key and the name of some other simple 'Digest::' as argument. \
 \
The hmac() and hmac_hex() functions and the Digest::HMAC->new() constructor \
takes an optional $blocksize argument as well. The HMAC algorithm assumes \
the digester to hash by iterating a basic compression function on blocks of \
data and the $blocksize should match the byte-length of such blocks. \
 \
The default $blocksize is 64 which is suitable for the MD5 and SHA-1 digest \
functions. For stronger algorithms the blocksize probably needs to be \
increased."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.50.0"

RPM_NAME = "perl-Digest-HMAC-1.50.0-1.10.noarch.rpm"
RPM_HASH = "757f2d37c35e1676514059e8b73c1b0d3faa511a19f449762b29b35921f1e2cc1700517366db2ea045490f41be95d16c899ddf1370813b4011c6e51b03d87269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Digest--HMAC \
perl-Digest--HMAC-MD5 \
perl-Digest--HMAC-SHA1 \
perl-Digest-HMAC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Digest--SHA"

inherit rpm
