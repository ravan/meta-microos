SUMMARY = "Tensor-based phase-Amplitude coupling package"
DESCRIPTION = "Tensorpac is an Python toolbox for computing Phase-Amplitude Coupling \
(PAC) using tensors and parallel computing."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python314-tensorpac-1.1-4.3.noarch.rpm"
RPM_HASH = "af354504d0626249615004ac27df69bed50c831f70ab4eaffc0cb00b327860166215b71efe76bfd7dde093715cacf00008186f5e57d8fe7847a344843cb098fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tensorpac \
python314-tensorpac \
python3dist-tensorpac"

RDEPENDS:${PN} += "python-abi \
python314-joblib \
python314-numpy \
python314-scipy"

inherit rpm
