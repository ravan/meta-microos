SUMMARY = "Data copying in the presence of I/O Errors"
DESCRIPTION = "dd_rescue helps when nothing else can: your disk has crashed and you \
try to copy it over to another one. While standard Unix tools like cp, \
cat, and dd will 'abort' on every I/O error, dd_rescue does not. \
 \
dd_rescue has many other goodies; optimization by using large blocks \
as long as no errors are in sight and falling back to small ones; reverse \
direction copy; splice in-kernel zerocopy; O_DIRECT support; preallocation \
with fallocate(). \
 \
dd_rescue also provides data protection features by overwriting files \
or disks with fast random numbers, optionally multiple times. \
 \
dd_rescue supports plugins; currently a hash, an lzo and a crypt plugin \
exist, supporting on the fly hash/HMAC calculation/validation, lzo \
de/compression and de/encryption. The lzo plugin is packaged in the \
dd_rescue-lzo, the crypt plugin in the dd_rescue-crypt subpackage."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.99.22"

RPM_NAME = "dd_rescue-1.99.22-1.4.aarch64.rpm"
RPM_HASH = "887f35e98c6233364e83829a8afe7e5059197c185ccfd8ed0133d81bf4edf92bec3cfec1fc3f13971da6ccb22e88c10d75747cb4968ec27489dd6b9c0d67c167"

RPROVIDES:${PN} += "dd-rescue \
ddrescue \
libddr-hash.so \
libddr-null.so"

RDEPENDS:${PN} += "bc \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
