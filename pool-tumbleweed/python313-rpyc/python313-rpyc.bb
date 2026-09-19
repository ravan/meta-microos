SUMMARY = "Remote Python Call (RPyC), a RPC library"
DESCRIPTION = "RPyC (pronounced like 'are-pie-see'), or Remote Python Call, is a \
transparent library for symmetrical remote procedure calls, \
clustering, and distributed-computing.  RPyC makes use of \
object-proxying, a technique that employs python's dynamic nature, to \
overcome the physical boundaries between processes and computers, so \
that remote objects can be manipulated as if they were local."
LICENSE = "MIT"

PV = "6.0.2"

RPM_NAME = "python313-rpyc-6.0.2-1.6.noarch.rpm"
RPM_HASH = "12c11ecada278e769288b4fef8de747a762845e7d98fbfc9675c8adba71f86de8f2edeab21b7bcf2b761f0c869581e71a005d87d135d971b70f8ee9b511e5a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpyc \
python3.13dist-rpyc \
python313-rpyc \
python3dist-rpyc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-plumbum \
update-alternatives"

inherit rpm
