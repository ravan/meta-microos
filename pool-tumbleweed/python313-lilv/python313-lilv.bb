SUMMARY = "Python 3 bindings for lilv"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications. \
This subpackage contains the Python 3 bindings for lilv."
LICENSE = "ISC"

PV = "0.28.0"

RPM_NAME = "python313-lilv-0.28.0-1.3.aarch64.rpm"
RPM_HASH = "622ee4087fa085ce28a1c37712ce9e3b130eeef48d23cffa518b1481a03ae8efd3cca8d516dc9d743d15558de4b00c1859eeed39da26e99ab8819f985b406fed"

RPROVIDES:${PN} += "python313-lilv"

RDEPENDS:${PN} += "liblilv-0-0 \
python-abi"

inherit rpm
