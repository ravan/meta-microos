SUMMARY = "A Python wrapper for tshark output parsing"
DESCRIPTION = "Python wrapper for tshark, allowing python packet parsing using \
wireshark dissectors."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python313-pyshark-0.6-3.2.noarch.rpm"
RPM_HASH = "776ef02456eeadfa7808e4247d7be09754d38e4988c08c5a0a3c4d4d8158cd82544c647cc8631f7e78566b2854953c9e80c07b28d4ea7f4ee10bd61f847509a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyshark \
python3.13dist-pyshark \
python313-pyshark \
python3dist-pyshark"

RDEPENDS:${PN} += "python-abi \
python313-appdirs \
python313-lxml \
python313-packaging \
python313-termcolor \
wireshark"

inherit rpm
