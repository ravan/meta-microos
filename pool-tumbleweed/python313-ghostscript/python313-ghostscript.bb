SUMMARY = "Python interface to the Ghostscript C-API"
DESCRIPTION = "Python interface to the Ghostscript C-API, both high and low-level, based on ctypes."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "python313-ghostscript-0.8.1-1.4.noarch.rpm"
RPM_HASH = "623c0514f0208dac3048e93cc0fe8703e76439949e41967e32d076b35b003947002742d55a0a3380f348443b62a35179cd9de7d14f3cf11b2b36d6e218f864de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ghostscript \
python3.13dist-ghostscript \
python313-ghostscript \
python3dist-ghostscript"

RDEPENDS:${PN} += "ghostscript \
python-abi \
python313-setuptools"

inherit rpm
