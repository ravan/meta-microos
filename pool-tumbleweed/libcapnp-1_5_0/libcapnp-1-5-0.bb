SUMMARY = "The Cap'n Proto data serialization library"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system. \
 \
This package provides runtime libraries for capnproto."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libcapnp-1_5_0-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "e28eda6952415774c623d66589996958366219e1f95368d7b4f1623b1bc385d185ea51b875716420dfe30e89a909eb6aff921ad5dde91f1ce2f279f74f0de047"

RPROVIDES:${PN} += "libcapnp-1-5-0 \
libcapnp-json.so.1.5.0 \
libcapnp-rpc.so.1.5.0 \
libcapnp-websocket.so.1.5.0 \
libcapnp.so.1.5.0 \
libcapnpc.so.1.5.0 \
libkj-async.so.1.5.0 \
libkj-http.so.1.5.0 \
libkj-test.so.1.5.0 \
libkj.so.1.5.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
