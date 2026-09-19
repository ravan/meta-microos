SUMMARY = "Go replacement for libslirp and VPNKit"
DESCRIPTION = "Go replacement for libslirp and VPNKit \
 \
gvisor-tap-vsock is based on the network stack of gVisor. Compared to libslirp, \
gvisor-tap-vsock brings a configurable DNS server and \
dynamic port forwarding."
LICENSE = "Apache-2.0"

PV = "0.8.9"

RPM_NAME = "gvisor-tap-vsock-0.8.9-1.3.aarch64.rpm"
RPM_HASH = "34b75ce7be4cf896214564f44e30554f1fe7f3e69c3fa3bba8ec0a6b33b8dd9db5cb2bef5b4fec007e1215c28c0e4b69ab86ac94193f709b4d8557befbaf4fed"

RPROVIDES:${PN} += "gvisor-tap-vsock \
gvproxy"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
