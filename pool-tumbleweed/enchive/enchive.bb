SUMMARY = "Long-term archive encryption tool"
DESCRIPTION = "Enchive is a tool to encrypt files to yourself for long-term archival. \
It's a focused, simple alternative to more complex solutions such as \
GnuPG or encrypted filesystems. \
 \
Files are secured with ChaCha20, Curve25519, and HMAC-SHA256."
LICENSE = "Unlicense"

PV = "3.5"

RPM_NAME = "enchive-3.5-2.9.aarch64.rpm"
RPM_HASH = "bb4c4cada9b4dabe42db7d310aab37b087bd421d32108b2d0d6dba8de9d28958ad2b85e2d2a4ddcc10af8dd1308a3064be093e83b2715cecda4ff5481e3a2844"

RPROVIDES:${PN} += "enchive"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
