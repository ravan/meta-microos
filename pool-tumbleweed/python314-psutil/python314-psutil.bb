SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "7.2.2"

RPM_NAME = "python314-psutil-7.2.2-2.3.aarch64.rpm"
RPM_HASH = "0637c670b50b2edbd20bb28a7d346b639d078f8b46b2680b3bbdee1b68815807b71527f677f2f84b55daf82eaf63bdef0024dd015bddb3e31b7eb0bb85e8ca7b"

RPROVIDES:${PN} += "python3.14dist-psutil \
python314-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
