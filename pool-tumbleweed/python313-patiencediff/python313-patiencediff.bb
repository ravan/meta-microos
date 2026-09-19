SUMMARY = "Python implementation of the patiencediff algorithm"
DESCRIPTION = "Python implementation of the patiencediff algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.18"

RPM_NAME = "python313-patiencediff-0.2.18-1.8.aarch64.rpm"
RPM_HASH = "09c035d1d451b75b1212b807f74d26e273923d329263f06114b0140320798d999381f34fe6836db50aa79abe43ca617ac455d463aad863125c1287f4940cb8e0"

RPROVIDES:${PN} += "python3-patiencediff \
python3.13dist-patiencediff \
python313-patiencediff \
python3dist-patiencediff"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
