SUMMARY = "A pytest plugin to create CodSpeed benchmarks"
DESCRIPTION = "A pytest plugin to create CodSpeed benchmarks."
LICENSE = "MIT"

PV = "5.0.3"

RPM_NAME = "python313-pytest-codspeed-5.0.3-1.2.aarch64.rpm"
RPM_HASH = "07ff266faa635d9ab6c9916e13ebfe11a821b0ade56a390b5068ddaaa03dc43c24324633ee7100fabd0f8a62b95635551e5fb877dbc9e000b17908d50ec881f5"

RPROVIDES:${PN} += "python3-pytest-codspeed \
python3.13dist-pytest-codspeed \
python313-pytest-codspeed \
python3dist-pytest-codspeed"

RDEPENDS:${PN} += "libc.so.6 \
python-abi \
python313-cffi \
python313-pytest \
python313-rich"

inherit rpm
