SUMMARY = "Tool to conveniently describe any Python datastructure"
DESCRIPTION = "Tool to conveniently describe any Python datastructure"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-Dumper-1.2.0-3.5.noarch.rpm"
RPM_HASH = "bfae48821f33c563cc8a99e39bbe8231e37b625a0624a996276c003dd8a8ec0973fdc4e4005f8dbd29283a085041dae2aba00d25c388c028eff10f3848b3fb9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dumper \
python314-Dumper \
python3dist-dumper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
