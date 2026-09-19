SUMMARY = "An extended implementation of JSONPath for Python"
DESCRIPTION = "This library provides a robust and significantly extended implementation \
of JSONPath for Python. It is tested with Python 2.6, 2.7, 3.2, 3.3, and PyPy. \
 \
This library differs from other JSONPath implementations in that it is a \
full *language* implementation, meaning the JSONPath expressions are \
first class objects, easy to analyze, transform, parse, print, and \
extend. (You can also execute them :-)"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python313-jsonpath-rw-1.4.0-8.5.noarch.rpm"
RPM_HASH = "7d3029da4d7709ddf70258068962f84155c693c1fb053af6ff6dcce5f1bc9608b47ab05804e412454201ad52066973e5d0461babfc2ccdcf02f72d98607b81ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpath-rw \
python3.13dist-jsonpath-rw \
python313-jsonpath-rw \
python3dist-jsonpath-rw"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-decorator \
python313-ply \
python313-six"

inherit rpm
