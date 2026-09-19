SUMMARY = "Generator for network diagram images from text"
DESCRIPTION = "nwdiag generates network diagram images from text."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python313-nwdiag-3.0.0-3.5.noarch.rpm"
RPM_HASH = "daa07cb18ee0e280d2e904425f2cbb4261191e4f387b78b4886a486e111ba429b21a8cca87dfb2213c1e5cfab8b7f64291a51ee597a8ef1d65676d9e090ee320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nwdiag \
python3.13dist-nwdiag \
python313-nwdiag \
python3dist-nwdiag"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-blockdiag \
python313-setuptools"

inherit rpm
