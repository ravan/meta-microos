SUMMARY = "Python bindings for Selenium"
DESCRIPTION = "Selenium Python Client Driver is a Python language binding for Selenium Remote \
Control (version 1.0 and 2.0). \
 \
Currently, the remote protocol, Firefox and Chrome for Selenium 2.0 are \
supported, as well as the Selenium 1.0 bindings."
LICENSE = "Apache-2.0"

PV = "4.45.0"

RPM_NAME = "python313-selenium-4.45.0-1.2.aarch64.rpm"
RPM_HASH = "cfb95e1b2711d20c6b544d8ead8785abca243e87e79583753585c1f57efc81d2ce019bba1f20bae3d86d2c1b3b4752781f576a7c8e92ebcf9102e8096cba77b1"

RPROVIDES:${PN} += "python3-selenium \
python3.13dist-selenium \
python313-selenium \
python3dist-selenium"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi \
python313-certifi \
python313-trio \
python313-trio-websocket \
python313-typing-extensions \
python313-urllib3 \
python313-websocket-client"

inherit rpm
