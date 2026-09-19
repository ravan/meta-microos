SUMMARY = "Get the currently executing AST node of a frame, and other information"
DESCRIPTION = "Get the currently executing AST node of a frame, and other information"
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python314-executing-2.2.1-3.2.noarch.rpm"
RPM_HASH = "aa1eef682b1aac04f05f71217a993d1613ac52c2138105dd8ba044f88e47a32bc860bce21b2b09b6004de725203ac728908ef6c9baa3301437f7f6f36d16d65d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-executing \
python314-executing \
python3dist-executing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
