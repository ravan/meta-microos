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

RPM_NAME = "python313-wheel-0.48.0-1.1.noarch.rpm"
RPM_HASH = "a6787054d1caa3426bb3a056e8b566ad03a8812f42f7779f0083a38ea3021597cfbf1b70d1794c6585cf81fe7607584d8e5701bd58ac3ae0562382d798b1a92e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wheel \
python3.13dist-wheel \
python313-wheel \
python3dist-wheel"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-packaging"

inherit rpm
