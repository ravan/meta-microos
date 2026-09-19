SUMMARY = "A poor man's debugger for Python"
DESCRIPTION = "A poor man's debugger for Python."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python314-PySnooper-1.2.3-1.4.noarch.rpm"
RPM_HASH = "3cd9cea46e1f38f0212f10cfa4e6b3f3980f76c4f28e90364f596e7cf1ffc8c44c83330b83c85b2b94ba544eef2fe88a7fce1ea3641dc709b4140812e87bd573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysnooper \
python314-PySnooper \
python3dist-pysnooper"

RDEPENDS:${PN} += "python-abi \
python314-base"

inherit rpm
