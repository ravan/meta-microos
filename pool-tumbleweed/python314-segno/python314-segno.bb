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

RPM_NAME = "python314-segno-1.6.6-1.5.noarch.rpm"
RPM_HASH = "5981c85d28ac8fd16517cfe8182b1f3c55dd5bded374ca13c83439451e1721e96c4f855435313f04ebfdaaae8c917aa57a4ba33a59f041389e6a19c73f58a0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-segno \
python314-segno \
python3dist-segno"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
