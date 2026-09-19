SUMMARY = "Zipfile generator"
DESCRIPTION = "zipstream.py is a ZIP archive generator based on Python 3.3's zipfile.py. \
zipstream can create archives on the fly, which is useful for streaming \
the archive to e.g. web clients without needing to store the archive on \
disk first."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "python313-zipstream-1.1.4-5.5.noarch.rpm"
RPM_HASH = "7f755df23835bccc32b334b078510c0372debbcb9a8c16028da716d1277cf8936e08f25509ae1e702c1686d8627d513fd4b65a30d4a3e98ed6f23c323be2e21b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zipstream \
python3.13dist-zipstream \
python313-zipstream \
python3dist-zipstream"

RDEPENDS:${PN} += "python-abi"

inherit rpm
