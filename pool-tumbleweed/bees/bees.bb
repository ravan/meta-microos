SUMMARY = "Best-Effort Extent-Same, a btrfs deduplication agent"
DESCRIPTION = "bees is a block-oriented userspace deduplication agent designed for large btrfs \
filesystems. It is an offline dedupe combined with an incremental data scan \
capability to minimize time data spends on disk from write to dedupe. \
 \
Hilights: \
 \
* Space-efficient hash table and matching algorithms - can use as little as 1 \
  GB hash table per 10 TB unique data (0.1GB/TB) \
* Daemon incrementally dedupes new data using btrfs tree search \
* Works with btrfs compression - dedupe any combination of compressed and uncompressed files \
* Persistent hash table for rapid restart after shutdown \
* Whole-filesystem dedupe - including snapshots \
* Constant hash table size - no increased RAM usage if data set becomes larger \
* Works on live data - no scheduled downtime required \
* Automatic self-throttling based on system load"
LICENSE = "GPL-3.0-only"

PV = "0.11~20260503"

RPM_NAME = "bees-0.11~20260503-1.3.aarch64.rpm"
RPM_HASH = "1fe26e598763653256627174dc064a4461bc386a253e58551321ecc1a6cdbaa587f17d64d8356752e377993c4e096398d276786e32e1c0f91275345289e283f3"

RPROVIDES:${PN} += "bees"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
