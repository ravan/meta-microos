SUMMARY = "Python binding to the wayland library using cffi"
DESCRIPTION = "Python binding to the wayland library using cffi."
LICENSE = "NCSA"

PV = "0.4.17"

RPM_NAME = "python313-pywayland-0.4.17-3.12.aarch64.rpm"
RPM_HASH = "77e9084a3eb0fe0febfc9bed7b7aca41b81f951626eaf7c811ff33cb18435b9a456dd962fd8aaed50c97ecdb6d8a900e8e2206dad57dbe19355b349525482f92"

RPROVIDES:${PN} += "python3-pywayland \
python3.13dist-pywayland \
python313-pywayland \
python3dist-pywayland"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
python-abi \
update-alternatives"

inherit rpm
