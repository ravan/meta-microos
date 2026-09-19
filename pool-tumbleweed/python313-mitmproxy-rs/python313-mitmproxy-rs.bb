SUMMARY = "Rust bits for mitmproxy"
DESCRIPTION = "This package contains mitmproxy's Rust bits."
LICENSE = "MIT"

PV = "0.12.9"

RPM_NAME = "python313-mitmproxy-rs-0.12.9-1.8.aarch64.rpm"
RPM_HASH = "ab07a363249955f13b98e1d11325418bb9e774ace2ab91b7c98ea623fbed0ab11cb380ff096b40ae3e4e0a5fc9dc07cfe4b182978bb8d5f8d0f1e73a2255ddc1"

RPROVIDES:${PN} += "python3-mitmproxy-rs \
python3.13dist-mitmproxy-rs \
python313-mitmproxy-rs \
python3dist-mitmproxy-rs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
