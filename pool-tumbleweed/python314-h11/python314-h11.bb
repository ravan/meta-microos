SUMMARY = "A pure-Python, bring-your-own-I/O implementation of HTTP/11"
DESCRIPTION = "This is a little HTTP/1.1 library written from scratch in Python, \
heavily inspired by hyper-h2 <https://hyper-h2.readthedocs.io>"
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python314-h11-0.16.0-1.5.noarch.rpm"
RPM_HASH = "bf83a1af758a9f20ba36ec8653272b4e66fe4ec9dc034c348fef7fbbb0ef39bc00a7518f328f34580555330504b4d985353aad18bc86a72c0a4d75700cba83ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-h11 \
python314-h11 \
python3dist-h11"

RDEPENDS:${PN} += "python-abi"

inherit rpm
