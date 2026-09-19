SUMMARY = "Pillow plugin for JPEG-XL, using Rust for bindings"
DESCRIPTION = "Pillow plugin for JPEG-XL, using Rust for bindings."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.8"

RPM_NAME = "python314-pillow-jxl-plugin-1.3.8-1.2.aarch64.rpm"
RPM_HASH = "f8ce870667aea72689799e575314564a0aef20d2ea42dcbf44e21f780ef6d2cfb2688ebba2f168c6ccdb0eed22976a591a730ed4744bafdf5a0dc5b99b3fd42f"

RPROVIDES:${PN} += "python3.14dist-pillow-jxl-plugin \
python314-pillow-jxl-plugin \
python3dist-pillow-jxl-plugin"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-Pillow \
python314-packaging"

inherit rpm
