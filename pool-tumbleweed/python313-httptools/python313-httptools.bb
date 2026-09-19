SUMMARY = "Python framework independent HTTP protocol utils"
DESCRIPTION = "httptools is a Python binding for the nodejs HTTP parser."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python313-httptools-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "ea4173c0b085e71ae289987d6d19de357e6aac1fd0985097af6ae02422e8222a09039922cf677765910e40a307df50de50c978612287ed6de4249efeb04be46c"

RPROVIDES:${PN} += "python3-httptools \
python3.13dist-httptools \
python313-httptools \
python3dist-httptools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
