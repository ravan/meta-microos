SUMMARY = "A Python SOCKS client module"
DESCRIPTION = "A Python SOCKS client module. \
 \
It is an actively maintained SocksiPy fork. Contains many \
improvements to the original. \
 \
See https://github.com/Anorov/PySocks for more information."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python313-PySocks-1.7.1-3.5.noarch.rpm"
RPM_HASH = "ca0dd43377f734cda805df6500401c0398f1fe183b91e104b21adb7736d098d99d9f6dbf5bdf4fd69c7b7acbaba90b95709d9e744bc9ce37eb08c8852173614b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PySocks \
python3.13dist-pysocks \
python313-PySocks \
python3dist-pysocks"

RDEPENDS:${PN} += "python-abi"

inherit rpm
