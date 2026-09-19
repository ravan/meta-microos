SUMMARY = "A lightweight template library"
DESCRIPTION = "A lightweight template library written in pure python."
LICENSE = "MIT"

PV = "3.2.5"

RPM_NAME = "python313-wheezy.template-3.2.5-1.5.aarch64.rpm"
RPM_HASH = "8a4013351338a7e644a699d7bf9f4c99635231a0b4c69c4c401bfd2886e2680244035b04a4f3d3eb080ac2137fe499a840fb0e62539fed062c6c965b0abc6c16"

RPROVIDES:${PN} += "python3-wheezy.template \
python3.13dist-wheezy.template \
python313-wheezy.template \
python3dist-wheezy.template"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
