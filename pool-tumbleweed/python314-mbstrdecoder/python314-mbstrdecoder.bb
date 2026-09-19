SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python314-mbstrdecoder-1.1.5-1.2.noarch.rpm"
RPM_HASH = "72217e1d01882ca33eff15a1d5f5dcc91be342a2589eed35c8cb47517c7742a2f210702d66ab3aae3d90d442ec1be5b0dcb72332df67e808af43a911ff35de9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mbstrdecoder \
python314-mbstrdecoder \
python3dist-mbstrdecoder"

RDEPENDS:${PN} += "python-abi \
python314-chardet"

inherit rpm
