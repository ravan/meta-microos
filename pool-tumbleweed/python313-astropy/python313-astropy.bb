SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "8.0.1"

RPM_NAME = "python313-astropy-8.0.1-2.1.aarch64.rpm"
RPM_HASH = "29e428bdb4c778e77a87a79df69753e4c83ec8860112b38c86772508ffb2872413fd848594d168fdb25b513bb5fc7abd4c2c8572fa32ad33929aabf385f34162"

RPROVIDES:${PN} += "python3-astropy \
python3.13dist-astropy \
python313-astropy \
python3dist-astropy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libm.so.6 \
libwcs.so.8 \
python-abi \
python313-PyYAML \
python313-astropy-iers-data \
python313-numpy \
python313-packaging \
python313-pyerfa \
update-alternatives"

inherit rpm
