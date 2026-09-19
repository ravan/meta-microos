SUMMARY = "LRU Cache in Memory"
DESCRIPTION = "This module implements a least recently used (LRU) cache in memory through \
a tie interface. Any time data is stored in the tied hash, that key/value \
pair has an entry time associated with it, and as the cache fills up, those \
members of the cache that are the oldest are removed to make room for new \
entries. \
 \
So, the cache only 'remembers' the last written entries, up to the size of \
the cache. This can be especially useful if you access great amounts of \
data, but only access a minority of the data a majority of the time. \
 \
The implementation is a hash, for quick lookups, overlaying a doubly linked \
list for quick insertion and deletion. On a WinNT PII 300, writes to the \
hash were done at a rate 3100 per second, and reads from the hash at 6300 \
per second. Work has been done to optimize refreshing cache entries that \
are frequently read from, code like $cache{entry}, which moves the entry to \
the end of the linked list internally."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.21"

RPM_NAME = "perl-Tie-Cache-0.21-1.43.noarch.rpm"
RPM_HASH = "549dbe4a52b4e26981a4e6f00df5e386c18ddf9f18d36f67ae5409f422e916e67a610744b577b89e35f797f8bd6f3ff2ee523f1b5a5502c250e7b362011036c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Cache \
perl-Tie-Cache"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
