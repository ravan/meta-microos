SUMMARY = "Stylesheet Generator for PyQt{4-5}/PySide{1-2}"
DESCRIPTION = "A python package designed to help with the construction of PyQt/PySide stylesheets."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python313-qstylizer-0.2.4-1.5.noarch.rpm"
RPM_HASH = "37b5806c6c76088f4e166df63a7c4054099fdd77f04fa1affa569ba78dc0568b14a1ecb73e0455aba2a904e00a2dfa98549e16ec44fc1695d9c2dfca12a95b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qstylizer \
python3.13dist-qstylizer \
python313-qstylizer \
python3dist-qstylizer"

RDEPENDS:${PN} += "python-abi \
python313-inflection \
python313-tinycss2"

inherit rpm
