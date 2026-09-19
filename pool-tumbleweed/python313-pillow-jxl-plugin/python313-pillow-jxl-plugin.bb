SUMMARY = "Pillow plugin for JPEG-XL, using Rust for bindings"
DESCRIPTION = "Pillow plugin for JPEG-XL, using Rust for bindings."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.8"

RPM_NAME = "python313-pillow-jxl-plugin-1.3.8-1.2.aarch64.rpm"
RPM_HASH = "f8271c12446c110d05b4f232a44b69f9dcc7829c5152d7e907acc8e4f4839d6cfbcb80607884c9135ab0bac77622325fc7ade6e9ea4157950e8bf052c7a7d201"

RPROVIDES:${PN} += "python3-pillow-jxl-plugin \
python3.13dist-pillow-jxl-plugin \
python313-pillow-jxl-plugin \
python3dist-pillow-jxl-plugin"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-Pillow \
python313-packaging"

inherit rpm
