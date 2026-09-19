SUMMARY = "jQuery repackaged for the XStatic standard"
DESCRIPTION = "jQuery javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "3.5.1.1"

RPM_NAME = "python314-XStatic-jQuery-3.5.1.1-2.5.aarch64.rpm"
RPM_HASH = "3cba31cc246207d471e3335ff201a9bc1c2e4e0a7cd173064f555a1fe65ea81165b872caf2780929f3ed52adc8b96cb39edffdb8c7d5d35f5b535379805f418f"

RPROVIDES:${PN} += "python3.14dist-xstatic-jquery \
python314-XStatic-jQuery \
python3dist-xstatic-jquery"

RDEPENDS:${PN} += "python-abi"

inherit rpm
