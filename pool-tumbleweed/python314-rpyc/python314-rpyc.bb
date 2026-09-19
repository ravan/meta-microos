SUMMARY = "Remote Python Call (RPyC), a RPC library"
DESCRIPTION = "RPyC (pronounced like 'are-pie-see'), or Remote Python Call, is a \
transparent library for symmetrical remote procedure calls, \
clustering, and distributed-computing.  RPyC makes use of \
object-proxying, a technique that employs python's dynamic nature, to \
overcome the physical boundaries between processes and computers, so \
that remote objects can be manipulated as if they were local."
LICENSE = "MIT"

PV = "6.0.2"

RPM_NAME = "python314-rpyc-6.0.2-1.6.noarch.rpm"
RPM_HASH = "946dc90563064c4c398b68f3feb9d1abd634c0da17b18eb99e30fa09a6b22021df69b5a89824697498a6e0daa7e9cdbf880247d5100a3ca9eb7c3e1f4b362d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rpyc \
python314-rpyc \
python3dist-rpyc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-plumbum \
update-alternatives"

inherit rpm
