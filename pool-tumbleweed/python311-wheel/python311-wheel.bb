SUMMARY = "A built-package format for Python"
DESCRIPTION = "A built-package format for Python. \
 \
A wheel is a ZIP-format archive with a specially formatted filename \
and the .whl extension. It is designed to contain all the files for a \
PEP 376 compatible install in a way that is very close to the on-disk \
format. Many packages will be properly installed with only the 'Unpack' \
step (simply extracting the file onto sys.path), and the unpacked archive \
preserves enough information to 'Spread' (copy data and scripts to their \
final locations) at any later time."
LICENSE = "MIT"

PV = "0.48.0"

RPM_NAME = "python311-wheel-0.48.0-1.1.noarch.rpm"
RPM_HASH = "f549e97d2b276e7efc89e89217dc6c90f9b692e8816e445577fd881c0cc92563fcf1ccb75963e4258d10ef693bfd0618a7d6f82da8d5429d48ae104871ac59ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-wheel \
python311-wheel \
python3dist-wheel"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-packaging"

inherit rpm
