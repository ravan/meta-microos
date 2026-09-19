SUMMARY = "Modern and easy to use streamable zip file generator"
DESCRIPTION = "A modern and easy to use streamable zip file generator. \
It can package and stream many files and folders into a zip on the fly \
without needing temporary files or excessive memory. \
 \
It can also calculate the final size of the zip file before streaming it. \
 \
Features: \
 * Generates zip data on the fly as it's requested. \
 * Can calculate the total size of the resulting zip file before generation even begins. \
 * Low memory usage: Since the zip is generated as it's requested, \
   very little has to be kept in memory (peak usage of less than 20MB is typical, even for TBs of files). \
 * Flexible API: Typical use cases are simple, complicated ones are possible. \
 * Supports zipping data from files, bytes, strings, and any other iterable objects. \
 * Keeps track of the date of the most recently modified file added to the zip file. \
 * Threadsafe: Won't mangle data if multiple threads concurrently add data to the same stream. \
 * Includes a clone of Python's http.server module with zip support added. Try python -m zipstream.server. \
 * Automatically uses Zip64 extensions, but only if they are required. \
 * No external dependencies."
LICENSE = "LGPL-3.0-only"

PV = "1.9.3"

RPM_NAME = "python313-zipstream-ng-1.9.3-1.1.noarch.rpm"
RPM_HASH = "1e52ee8975bb6fbbd9355f49764c049c4203a358a70918972da109d288dee38248a6027f7f1dd73acbff1b99c95ffd47ea8b2e43fd0be5064f54394e36e78d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zipstream-ng \
python3.13dist-zipstream-ng \
python313-zipstream-ng \
python3dist-zipstream-ng"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
