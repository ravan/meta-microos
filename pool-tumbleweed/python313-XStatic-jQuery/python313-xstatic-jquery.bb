SUMMARY = "jQuery repackaged for the XStatic standard"
DESCRIPTION = "jQuery javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "3.5.1.1"

RPM_NAME = "python313-XStatic-jQuery-3.5.1.1-2.5.aarch64.rpm"
RPM_HASH = "6fba0ddca8ce63387cd441a0f54b970b5817a316104f8a09aa2be54fe66b0ff70ab71cdc0c2045675454897d224074f681a5c96fe4c235e5d0fdb958f6eac566"

RPROVIDES:${PN} += "python3-XStatic-jQuery \
python3.13dist-xstatic-jquery \
python313-XStatic-jQuery \
python3dist-xstatic-jquery"

RDEPENDS:${PN} += "python-abi"

inherit rpm
