SUMMARY = "Python binding to the wlroots library using cffi"
DESCRIPTION = "Python binding to the wlroots library using cffi."
LICENSE = "NCSA"

PV = "0.17.0"

RPM_NAME = "python313-pywlroots-0.17.0-1.11.aarch64.rpm"
RPM_HASH = "16b2aa23fd6c281cad6d85dbade7b30919a27be91d1e751f5f005ecec5bf02e074f326de78c3fafc97c453476a8c97f8aa235a23c12b6da4eae50397fb82b6ef"

RPROVIDES:${PN} += "python3-pywlroots \
python3.13dist-pywlroots \
python313-pywlroots \
python3dist-pywlroots"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwlroots.so.12 \
python-abi \
python313-pywayland \
python313-xkbcommon"

inherit rpm
