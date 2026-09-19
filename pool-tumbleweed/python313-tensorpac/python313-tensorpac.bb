SUMMARY = "Tensor-based phase-Amplitude coupling package"
DESCRIPTION = "Tensorpac is an Python toolbox for computing Phase-Amplitude Coupling \
(PAC) using tensors and parallel computing."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python313-tensorpac-1.1-4.3.noarch.rpm"
RPM_HASH = "12c02e5d5cf8c10b97f3fdc108e219b1176ef3c37ff2b5abf61d18a955b661e8da2725b09c7d82ae7746de66cad3a53da0c34eee5834f6bdde214dc5b8e8f1a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tensorpac \
python3.13dist-tensorpac \
python313-tensorpac \
python3dist-tensorpac"

RDEPENDS:${PN} += "python-abi \
python313-joblib \
python313-numpy \
python313-scipy"

inherit rpm
