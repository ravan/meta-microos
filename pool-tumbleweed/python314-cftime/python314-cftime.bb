SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "python314-cftime-1.6.5-1.7.aarch64.rpm"
RPM_HASH = "bc538819985d011b855596f682d73cab54f8668d451a0fd6903062703d8f267902535bf3f17f99580cff600ba0a09b251913ab56ee699b0eb79587d28cacc136"

RPROVIDES:${PN} += "python3.14dist-cftime \
python314-cftime \
python3dist-cftime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-numpy"

inherit rpm
