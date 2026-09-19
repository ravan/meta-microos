SUMMARY = "Python bindings for Selenium"
DESCRIPTION = "Selenium Python Client Driver is a Python language binding for Selenium Remote \
Control (version 1.0 and 2.0). \
 \
Currently, the remote protocol, Firefox and Chrome for Selenium 2.0 are \
supported, as well as the Selenium 1.0 bindings."
LICENSE = "Apache-2.0"

PV = "4.45.0"

RPM_NAME = "python314-selenium-4.45.0-1.2.aarch64.rpm"
RPM_HASH = "d6217f25a283b86b8911f56618b078cdce51d2cebcfa4ef805314622d73780a23df24c6fb7efe108401e1ff3ad70d7aba80823f6a53ba52becdbfd0c002d5ae1"

RPROVIDES:${PN} += "python3.14dist-selenium \
python314-selenium \
python3dist-selenium"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python314-certifi \
python314-trio \
python314-trio-websocket \
python314-typing-extensions \
python314-urllib3 \
python314-websocket-client"

inherit rpm
