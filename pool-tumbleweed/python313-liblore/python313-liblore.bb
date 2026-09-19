SUMMARY = "Python library for public-inbox.org"
DESCRIPTION = "A Python library for working with https://public-inbox.org/ servers, \
particularly https://lore.kernel.org/. It fetches email threads, parses mbox \
files, and provides utilities for working with email messages from mailing list \
archives."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.1"

RPM_NAME = "python313-liblore-0.8.1-1.1.noarch.rpm"
RPM_HASH = "419e3f28aa56169e7878e0641b50fad0c796f9f5248b55cfe329b9aa8f36061b0d0bdea25d03cbbf02bbc6f0d4946f5b9917db81a30dfbe523172652c46fb124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-liblore \
python3.13dist-liblore \
python313-liblore \
python3dist-liblore"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
