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

RPM_NAME = "python313-requests-cache-1.3.2-2.2.noarch.rpm"
RPM_HASH = "610bc2dff765a32a48506ad50ec81b1257fe66c378dca08803ddafd036d592b8dedfbc16eb64e715d7ee28de399699a4955e0c3a7b85365dc2ca9a3e9e49c2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-cache \
python3.13dist-requests-cache \
python313-requests-cache \
python3dist-requests-cache"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-cattrs \
python313-platformdirs \
python313-requests \
python313-url-normalize \
python313-urllib3"

inherit rpm
