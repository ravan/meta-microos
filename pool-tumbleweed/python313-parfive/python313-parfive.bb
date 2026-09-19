SUMMARY = "A HTTP and FTP parallel file downloader"
DESCRIPTION = "Parfive is a library for downloading files, its objective is to \
provide an API for queuing files for download and then providing \
feedback to the user about the downloads in progress. It also \
provides an interface for inspecting any failed downloads."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python313-parfive-2.3.1-1.1.noarch.rpm"
RPM_HASH = "1f89c17e51b23bd9591216454ef9f96e7cf90d8de2bb798ee079a11b5b80ceec1c2a0f7ee97873651af2b3a90f201e25e5444b497c21e29d8643d901a1f3b358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parfive \
python3.13dist-parfive \
python313-parfive \
python3dist-parfive"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-aiohttp \
python313-tqdm \
update-alternatives"

inherit rpm
