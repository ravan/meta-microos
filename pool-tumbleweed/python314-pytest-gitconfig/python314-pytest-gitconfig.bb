SUMMARY = "Provide a Git config sandbox for testing"
DESCRIPTION = "Provide a Git config sandbox for testing"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-pytest-gitconfig-0.9.0-1.2.noarch.rpm"
RPM_HASH = "b3901756d1d72f578327efa0d16843ada2108e2229ec4f0f9311ec8d4311508d043d3a6afa041a6af64f789c1e6daa036c8fe10896bee079b08665801773c434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-gitconfig \
python314-pytest-gitconfig \
python3dist-pytest-gitconfig"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
