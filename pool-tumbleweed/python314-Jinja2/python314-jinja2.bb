SUMMARY = "A template engine written in pure Python"
DESCRIPTION = "Jinja2 is a template engine written in pure Python.  It provides a Django \
inspired non-XML syntax but supports inline expressions and an optional \
sandboxed environment."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python314-Jinja2-3.1.6-2.5.aarch64.rpm"
RPM_HASH = "7f0a0f81b02a953b4047edd45b1277fdf8aa272d0e3d4b8b48315a0ca26a0d85ad180aed93e74879658975075703db5493e3bff36646629075406f704bb44ce4"

RPROVIDES:${PN} += "python3.14dist-jinja2 \
python314-Jinja2 \
python314-jinja2 \
python3dist-jinja2"

RDEPENDS:${PN} += "python-abi \
python314-MarkupSafe"

inherit rpm
