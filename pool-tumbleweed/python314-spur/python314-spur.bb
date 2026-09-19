SUMMARY = "Run commands and manipulate files locally or over SSH"
DESCRIPTION = "Run commands and manipulate files locally or over SSH using the same interface"
LICENSE = "BSD-2-Clause"

PV = "0.3.23"

RPM_NAME = "python314-spur-0.3.23-3.5.noarch.rpm"
RPM_HASH = "1e1bb22a27fdf0fad5d0fc720738d98b43924edbaa3a49ec368612f424f7a9b2fa533bd7aa8e7f809e3f191fb952567219e88046ca52a831c48b5aacfbb7e777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-spur \
python314-spur \
python3dist-spur"

RDEPENDS:${PN} += "python-abi \
python314-paramiko"

inherit rpm
