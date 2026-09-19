SUMMARY = "Fastimport parser in Python"
DESCRIPTION = "This is the Python parser that was originally developed for \
bzr-fastimport, but extracted so it can be used by other projects. \
 \
It is currently used by bzr-fastimport and dulwich. hg-fastimport and \
git-remote-hg use a slightly modified version of it."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.16"

RPM_NAME = "python313-fastimport-0.9.16-1.4.noarch.rpm"
RPM_HASH = "e8a541cd672c6329ec3b55d9d5d5daf69e0e1788cb8604360f4b9c040510a6ad7d861ca6411566a00f04e0bcb68cf0039c4f8b96e614458229b4fd99aecf51fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastimport \
python3.13dist-fastimport \
python313-fastimport \
python3dist-fastimport"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
