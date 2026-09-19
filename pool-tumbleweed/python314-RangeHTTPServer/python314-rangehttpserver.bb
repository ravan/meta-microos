SUMMARY = "SimpleHTTPServer with support for Range requests"
DESCRIPTION = "SimpleHTTPServer with support for Range requests"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python314-RangeHTTPServer-1.4.0-1.9.noarch.rpm"
RPM_HASH = "cacdd7d839424698201881645a1b32eda53b6c8e70bd6da016ee2ef2268bab12f0bdef047d36674284252f76d9d9257e3fbb0fd34632326dbb3bae65691d10e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rangehttpserver \
python314-RangeHTTPServer \
python3dist-rangehttpserver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
