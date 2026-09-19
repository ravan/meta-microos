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

RPM_NAME = "python312-wheel-0.48.0-1.1.noarch.rpm"
RPM_HASH = "f6fc042c9d784a08337160476fb1bda01fa592e68a16a0dbb5b7598e2a25bd312a27f0c94010b798624e81410775a4da579f4d5d292945f54634041a79bdce0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-wheel \
python312-wheel \
python3dist-wheel"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
python-abi \
python312-packaging"

inherit rpm
