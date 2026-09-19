SUMMARY = "The python xarray[accel] extra"
DESCRIPTION = "The [accel] extra for xarray, N-D labeled arrays and datasets in Python \
Except flox and numbagg, because they are not packaged yet. \
Use `pip --user install flox numbagg` to install from PyPI, if needed."
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python313-xarray-accel-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "44af1580a34024920412012183d3bab92ab0fe305fa47ad4f3ef79effcbc4a05de248202c546ba80c94f4410b7a4d5d776f92b5d62bf0828952e617f6e4d4f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray-accel \
python313-xarray-accel"

RDEPENDS:${PN} += "python313-Bottleneck \
python313-numba \
python313-opt-einsum \
python313-scipy \
python313-xarray"

inherit rpm
