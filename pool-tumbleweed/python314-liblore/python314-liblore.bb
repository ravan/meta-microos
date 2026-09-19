SUMMARY = "Python library for public-inbox.org"
DESCRIPTION = "A Python library for working with https://public-inbox.org/ servers, \
particularly https://lore.kernel.org/. It fetches email threads, parses mbox \
files, and provides utilities for working with email messages from mailing list \
archives."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.1"

RPM_NAME = "python314-liblore-0.8.1-1.1.noarch.rpm"
RPM_HASH = "6ad77a0f11c6afcc6870b6c50ca2550def59bf998ac842cc79d6cb0f8ee300c6849e3847b3d28612fb15f5e7ef38b3e11db59b923ea43db4f9f711b6f401730a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-liblore \
python314-liblore \
python3dist-liblore"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
