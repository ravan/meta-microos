SUMMARY = "Tracing tools from the BPF Compiler Collection"
DESCRIPTION = "Python tracing scripts from the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.37.0"

RPM_NAME = "bcc-tools-0.37.0-4.1.aarch64.rpm"
RPM_HASH = "52ebf57947aef0b3cd4e87e2845f7b16a75f3e31000a85c3b2fa250f7ef50effc22163ac8ea5f6ed35b781b7edd76f817ea5af749518e7ac0c716631762e12e5"

RPROVIDES:${PN} += "bcc-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
audit \
ld-linux-aarch64.so.1 \
libbcc-bpf.so.0 \
libbpf.so.1 \
libc.so.6 \
python3-bcc \
python3-pyelftools"

inherit rpm
