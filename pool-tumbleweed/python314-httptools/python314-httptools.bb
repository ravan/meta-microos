SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python314-httptools-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "df4ad9e3cfe1d12078d30cf6b500542ba0ddf33345392020052dc09babcd4a13c1d6648db223fe6a276460f8bdf4cbcc8991d7792d1c9d467fde1f77a4b88529"

RPROVIDES:${PN} += "python3.14dist-httptools \
python314-httptools \
python3dist-httptools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
