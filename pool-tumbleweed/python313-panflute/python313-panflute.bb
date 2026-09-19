SUMMARY = "Pandoc filters package for Python"
DESCRIPTION = "Panflute is a Python package for writing Pandoc filters."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python313-panflute-2.3.1-1.10.noarch.rpm"
RPM_HASH = "ee1f5d62b2a201a4b435814d58b56205eaf221c7fc7d4080abc453b49055d747007d0513e807b988561548d5f6b0c11f762581f61e0acb8c33958a4206962a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-panflute \
python3.13dist-panflute \
python313-panflute \
python3dist-panflute"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-click \
update-alternatives"

inherit rpm
