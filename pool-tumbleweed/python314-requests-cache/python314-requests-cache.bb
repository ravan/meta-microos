SUMMARY = "Persistent cache for requests library"
DESCRIPTION = "Requests-cache is a transparent persistent cache for requests_ library. \
 \
It can be useful when you are creating some simple data scraper with constantly \
changing parsing logic or data format, and don't want to redownload pages or \
write complex error handling and persistence. \
 \
Requests-cache ignores all cache headers, it just caches the data for the \
time you specify. \
 \
If you need library which knows how to use HTTP headers and status codes, \
take a look at `CacheControl <https://github.com/ionrock/cachecontrol>`_."
LICENSE = "BSD-2-Clause"

PV = "1.3.2"

RPM_NAME = "python314-requests-cache-1.3.2-2.2.noarch.rpm"
RPM_HASH = "0f3bbfafe1c7f96a39b9abdccbbf83a56d109981bec04aa7eb702bee1776bc351fad5be541f3a55b24be6f5ade83409220f1f64116586d40b631c166488f89e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-cache \
python314-requests-cache \
python3dist-requests-cache"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-cattrs \
python314-platformdirs \
python314-requests \
python314-url-normalize \
python314-urllib3"

inherit rpm
