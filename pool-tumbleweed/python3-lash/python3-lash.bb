SUMMARY = "Python bindings for LASH"
DESCRIPTION = "This package contains the language bindings for Python."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "python3-lash-0.5.4-5.7.aarch64.rpm"
RPM_HASH = "03ce64c70242c134036a91e8d16442ddf409b5053ce1daf20e8350cdd28c373c691c9653c166cdad573fa58cb8fa1bf6bda370a08d1d41f42e0c3a606c0bd8cd"

RPROVIDES:${PN} += "python3-lash"

RDEPENDS:${PN} += "lash \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblash.so.1 \
python-abi"

inherit rpm
