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

RPM_NAME = "python314-wheel-0.48.0-1.1.noarch.rpm"
RPM_HASH = "417357ce3f26527b17c7738d6b18e72aaa8c920901aa4169d1d2f37b96a05d1efa753926999cb3cd5c5a415bdc580f0408cecd03bf7e47a8e3cea4fd5b192e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wheel \
python314-wheel \
python3dist-wheel"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-packaging"

inherit rpm
