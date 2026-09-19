SUMMARY = "SimpleHTTPServer with support for Range requests"
DESCRIPTION = "SimpleHTTPServer with support for Range requests"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python313-RangeHTTPServer-1.4.0-1.9.noarch.rpm"
RPM_HASH = "0d71847867f113d6b475164af02e85913311654bae7c80e28bbd6a85cac97e532c89af5fd52ab107aa11b23bc9668aa4df8fb45add5686f53f141b3622093e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-RangeHTTPServer \
python3.13dist-rangehttpserver \
python313-RangeHTTPServer \
python3dist-rangehttpserver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
