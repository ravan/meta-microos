SUMMARY = "The python xarray[accel] extra"
DESCRIPTION = "The [accel] extra for xarray, N-D labeled arrays and datasets in Python \
Except flox and numbagg, because they are not packaged yet. \
Use `pip --user install flox numbagg` to install from PyPI, if needed."
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python314-xarray-accel-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "bbde6c6870e074b6ff011c0e314f3891d7cafdb4e0a8453dc6f32d089a8c04bf52dabf8eab51ebec6ddbdb2feb789ba731e2e62d7317edbc60922ac3f461db85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-xarray-accel"

RDEPENDS:${PN} += "python314-Bottleneck \
python314-numba \
python314-opt-einsum \
python314-scipy \
python314-xarray"

inherit rpm
