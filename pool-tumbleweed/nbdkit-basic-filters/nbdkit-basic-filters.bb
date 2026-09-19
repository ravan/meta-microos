SUMMARY = "Basic filters for nbdkit"
DESCRIPTION = "This package contains filters for nbdkit which only depend on simple \
C libraries: glibc, gnutls, zlib, and zstd.  Other filters for nbdkit \
with more complex dependencies are packaged separately. \
 \
nbdkit-blocksize-filter     Adjusts block size of requests sent to plugins. \
 \
nbdkit-blocksize-policy-filter  Set block size constraints and policy. \
 \
nbdkit-cache-filter         Server-side cache. \
 \
nbdkit-checkwrite-filter    Checks writes match contents of plugin. \
 \
nbdkit-cow-filter           Copy-on-write overlay for read-only plugins. \
 \
nbdkit-ddrescue-filter      Filter for serving from ddrescue dump. \
 \
nbdkit-delay-filter         Injects read and write delays. \
 \
nbdkit-error-filter         Injects errors. \
 \
nbdkit-evil-filter          Add random data corruption to reads. \
 \
nbdkit-exitlast-filter      Exits on last client connection. \
 \
nbdkit-exitwhen-filter      Exits gracefully when an event occurs. \
 \
nbdkit-exportname-filter    Adjusts export names between client and plugin. \
 \
nbdkit-extentlist-filter    Places extent list over a plugin. \
 \
nbdkit-fua-filter           Modifies flush behaviour in plugins. \
 \
nbdkit-gzip-filter          Decompress a .gz file. \
 \
nbdkit-ip-filter            Filters clients by IP address. \
 \
nbdkit-limit-filter         Limits the number of clients that can connect concurrently. \
 \
nbdkit-log-filter           Logs all transactions to a file. \
 \
nbdkit-luks-filter          Read and write LUKS-encrypted disks. \
 \
nbdkit-multi-conn-filter    Modifies the way multiple clients can connect to the same export simultaneously. \
 \
nbdkit-nocache-filter       Disables cache requests in the underlying plugin. \
 \
nbdkit-noextents-filter     Disables extents in the underlying plugin. \
 \
nbdkit-nofilter-filter      Passthrough filter. \
 \
nbdkit-noparallel-filter    Serializes requests to the underlying plugin. \
 \
nbdkit-nozero-filter        Adjusts handling of zero requests by plugins. \
 \
nbdkit-offset-filter        Serves an offset and range. \
 \
nbdkit-partition-filter     Serves a single partition. \
 \
nbdkit-pause-filter         Pauses NBD requests. \
 \
nbdkit-protect-filter       Write-protect parts of a plugin. \
 \
nbdkit-rate-filter          Limits bandwidth by connection or server. \
 \
nbdkit-readahead-filter     Prefetches data when reading sequentially. \
 \
nbdkit-readonly-filter      Switch a plugin between read-only and writable. \
 \
nbdkit-retry-filter         Reopens connection on error. \
 \
nbdkit-retry-request-filter Retries single requests if they fail. \
 \
nbdkit-rotational-filter    Set if a plugin is rotational or not. \
 \
nbdkit-scan-filter          Prefetch data ahead of sequential reads. \
 \
nbdkit-spinning-filter      Add seek delays to simulate a spinning hard disk. \
 \
nbdkit-swab-filter          Filter for swapping byte order. \
 \
nbdkit-time-limit-filter    Set an overall time limit for each connection. \
 \
nbdkit-tls-fallback-filter  TLS protection filter. \
 \
nbdkit-truncate-filter      Truncates, expands, rounds up or rounds down size."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-basic-filters-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "dba02c4ce22db963f1573ed853a0820c7b56d8cb5fa2b91850763a96caaf114ede9c43acd14962c75743ebfa1b688d84de04cd5f56fe9f1eeb774e9a4609b91b"

RPROVIDES:${PN} += "nbdkit-basic-filters \
nbdkit-blocksize-filter \
nbdkit-blocksize-policy-filter \
nbdkit-cache-filter \
nbdkit-checkwrite-filter \
nbdkit-cow-filter \
nbdkit-ddrescue-filter \
nbdkit-delay-filter \
nbdkit-error-filter \
nbdkit-evil-filter \
nbdkit-exitlast-filter \
nbdkit-exitwhen-filter \
nbdkit-exportname-filter \
nbdkit-extentlist-filter \
nbdkit-fua-filter \
nbdkit-gzip-filter \
nbdkit-ip-filter \
nbdkit-limit-filter \
nbdkit-log-filter \
nbdkit-luks-filter \
nbdkit-multi-conn-filter \
nbdkit-nocache-filter \
nbdkit-noextents-filter \
nbdkit-nofilter-filter \
nbdkit-noparallel-filter \
nbdkit-nozero-filter \
nbdkit-offset-filter \
nbdkit-partition-filter \
nbdkit-pause-filter \
nbdkit-protect-filter \
nbdkit-rate-filter \
nbdkit-readahead-filter \
nbdkit-readonly-filter \
nbdkit-retry-filter \
nbdkit-retry-request-filter \
nbdkit-rotational-filter \
nbdkit-scan-filter \
nbdkit-spinning-filter \
nbdkit-swab-filter \
nbdkit-time-limit-filter \
nbdkit-tls-fallback-filter \
nbdkit-truncate-filter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libz.so.1 \
nbdkit-server"

inherit rpm
