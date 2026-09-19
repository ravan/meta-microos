SUMMARY = "High performance, near optimal caching library based on Java 8"
DESCRIPTION = "A Cache is similar to ConcurrentMap, but not quite the same. The most \
fundamental difference is that a ConcurrentMap persists all elements that are \
added to it until they are explicitly removed. A Cache on the other hand is \
generally configured to evict entries automatically, in order to constrain its \
memory footprint. In some cases a LoadingCache or AsyncLoadingCache can be \
useful even if it doesn't evict entries, due to its automatic cache loading. \
 \
Caffeine provide flexible construction to create a cache with a combination \
of the following features: \
automatic loading of entries into the cache, optionally asynchronously \
size-based eviction when a maximum is exceeded based on frequency and recency \
time-based expiration of entries, measured since last access or last write \
asynchronously refresh when the first stale request for an entry occurs \
keys automatically wrapped in weak references \
values automatically wrapped in weak or soft references \
notification of evicted (or otherwise removed) entries \
writes propagated to an external resource \
accumulation of cache access statistics"
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "caffeine-2.9.3-2.5.noarch.rpm"
RPM_HASH = "c47467fb95f9652662766052d5297072bc43200209228da23c028ca4af9949ec7fdd552f044afce2758164f2a521d3b80e55252a2be8a319c190943fca46394b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caffeine \
mvn-com.github.ben-manes.caffeine-caffeine \
mvn-com.github.ben-manes.caffeine-caffeine-pom- \
osgi-com.github.ben-manes.caffeine"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.errorprone-error-prone-annotations \
mvn-org.checkerframework-checker-qual"

inherit rpm
