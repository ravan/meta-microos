SUMMARY = "The Cache interface"
DESCRIPTION = "The Cache modules are designed to assist a developer in persisting data for \
a specified period of time. Often these modules are used in web \
applications to store data locally to save repeated and redundant expensive \
calls to remote machines or databases. People have also been known to use \
Cache::Cache for its straightforward interface in sharing data between runs \
of an application or invocations of a CGI-style script or simply as an easy \
to use abstraction of the filesystem or shared memory. \
 \
The Cache::Cache interface is implemented by classes that support the get, \
set, remove, size, purge, and clear instance methods and their \
corresponding static methods for persisting data across method calls."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.80.0"

RPM_NAME = "perl-Cache-Cache-1.80.0-1.7.noarch.rpm"
RPM_HASH = "68b36c0b9d4e700a68a68aaee9cd481d74638543349e7e7c33512fda1047553e4336acb1f1ab6994b9dac929c3538c3993faf2dd7a6ee6ad6a3452824a7956a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cache--BaseCache \
perl-Cache--BaseCacheTester \
perl-Cache--Cache \
perl-Cache--CacheMetaData \
perl-Cache--CacheSizer \
perl-Cache--CacheTester \
perl-Cache--CacheUtils \
perl-Cache--FileBackend \
perl-Cache--FileCache \
perl-Cache--MemoryBackend \
perl-Cache--MemoryCache \
perl-Cache--NullCache \
perl-Cache--Object \
perl-Cache--SharedMemoryBackend \
perl-Cache--SharedMemoryCache \
perl-Cache--SizeAwareCache \
perl-Cache--SizeAwareCacheTester \
perl-Cache--SizeAwareFileCache \
perl-Cache--SizeAwareMemoryCache \
perl-Cache--SizeAwareSharedMemoryCache \
perl-Cache-Cache"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Digest--SHA1 \
perl-Error \
perl-IPC--ShareLite"

inherit rpm
