SUMMARY = "The python xarray[complete] extra"
DESCRIPTION = "The [complete] extra for xarray, N-D labeled arrays and datasets in Python"
LICENSE = "Apache-2.0"

PV = "2026.02.0"

RPM_NAME = "python313-xarray-complete-2026.02.0-3.1.noarch.rpm"
RPM_HASH = "1cd5e6157dba44c38f874e5e713d29ee5fad5634b4ffc4e8929c3f9030bcbc5ffba8b5bf3f054862dff1c48a5f2e4b835bcb6c1313a29cf96a2bbbe66fbe28df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xarray-complete \
python313-xarray-complete"

RDEPENDS:${PN} += "python313-xarray \
python313-xarray-accel \
python313-xarray-io \
python313-xarray-parallel \
python313-xarray-viz"

inherit rpm
