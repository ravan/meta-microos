SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python314-parfive-2.3.1-1.1.noarch.rpm"
RPM_HASH = "81be17ff67053e76ea35e68dba0802bc683b2453586ec352fe6a916c342aee3b058ebf134a058d2bfc2fa428b1566540bb23723cb6cc67fe279c4715b7378162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-parfive \
python314-parfive \
python3dist-parfive"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-aiohttp \
python314-tqdm \
update-alternatives"

inherit rpm
