SUMMARY = "A high-performance neural network inference framework"
DESCRIPTION = "ncnn is a high-performance neural network inference computing framework \
optimized for mobile platforms. ncnn is deeply considerate about deployment and \
uses on mobile phones from the beginning of design. ncnn does not have third \
party dependencies. It is cross-platform, and runs faster than all known open \
source frameworks on mobile phone cpu. Developers can easily deploy deep \
learning algorithm models to the mobile platform by using efficient ncnn \
implementation, create intelligent APPs, and bring the artificial intelligence \
to your fingertips. ncnn is currently being used in many Tencent applications, \
such as QQ, Qzone, WeChat, Pitu and so on."
LICENSE = "BSD-2-Clause & BSD-3-Clause & Zlib"

PV = "20250916"

RPM_NAME = "ncnn-20250916-1.12.aarch64.rpm"
RPM_HASH = "d64c40bbe9718c7746aa723e5b7a84915dee705579987000f3a85c97b1c77652f5a95541dc1c2b53f12d85b2a51af5a36124d565387a61ddd69cbadb127fd4b5"

RPROVIDES:${PN} += "ncnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libncnn.so.1 \
libprotobuf.so.36.1.0 \
libstdc++.so.6"

inherit rpm
