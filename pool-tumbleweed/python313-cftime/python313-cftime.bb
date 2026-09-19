SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "python313-cftime-1.6.5-1.7.aarch64.rpm"
RPM_HASH = "2563992624d869f50a1f166b530096d6b21572aa29dcb46c850d6e34f71779bf6647a57ea2eecb84b894df47cc535f7c8a5201ef40e1e11ed645c637555f6afa"

RPROVIDES:${PN} += "python3-cftime \
python3.13dist-cftime \
python313-cftime \
python3dist-cftime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-numpy"

inherit rpm
