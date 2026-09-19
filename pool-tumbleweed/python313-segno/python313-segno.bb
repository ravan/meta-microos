SUMMARY = "QR Code and Micro QR Code generator for Python"
DESCRIPTION = "QR Code encoder and Micro QR Code encoder \
 \
Pure Python QR Code generator with no dependencies. \
 \
The project provides more than 1500 test cases (coverage >= 98%) to verify a \
standard conform QR Code and Micro QR Code generation acc. to ISO/IEC \
18004:2015(E)."
LICENSE = "BSD-3-Clause"

PV = "1.6.6"

RPM_NAME = "python313-segno-1.6.6-1.5.noarch.rpm"
RPM_HASH = "0625f760892cd300e395e876f616a503813fff9764b467262d9c91a2c9c0e1b6fa0b07cbe88af8064352290b8a3890202762450fa0b626f1d6f68aa2f6b517c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-segno \
python3.13dist-segno \
python313-segno \
python3dist-segno"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
