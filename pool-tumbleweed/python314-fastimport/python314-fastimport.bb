SUMMARY = "Fastimport parser in Python"
DESCRIPTION = "This is the Python parser that was originally developed for \
bzr-fastimport, but extracted so it can be used by other projects. \
 \
It is currently used by bzr-fastimport and dulwich. hg-fastimport and \
git-remote-hg use a slightly modified version of it."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.16"

RPM_NAME = "python314-fastimport-0.9.16-1.4.noarch.rpm"
RPM_HASH = "55aab60a82b74fa3f8c20ab8978b7199ce9bdff062e09c0466616620fa30b2690ce1b4e0e3797fea013704b384c0f1453af1d15f3eddf85147d03bece557b124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fastimport \
python314-fastimport \
python3dist-fastimport"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
