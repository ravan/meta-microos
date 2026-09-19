SUMMARY = "Irregular methods for regular expressions"
DESCRIPTION = "A command line tool and python module that generates all or random matching strings to a given regular expression and more."
LICENSE = "AGPL-3.0-or-later"

PV = "0.12.0"

RPM_NAME = "python314-exrex-0.12.0-1.2.noarch.rpm"
RPM_HASH = "7ff47a72512cc7949769a1ddc7db9e0dd566c4b95ac22447875926a81492aabdebe4bd2b287f95f4add9b10b361953e033da3e1759addc06d8e423c7c752ee0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-exrex \
python314-exrex \
python3dist-exrex"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-setuptools"

inherit rpm
