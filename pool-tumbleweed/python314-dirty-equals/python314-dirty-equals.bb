SUMMARY = "Doing dirty (but useful) things with equals"
DESCRIPTION = "Doing dirty (but extremely useful) things with equals."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python314-dirty-equals-0.11.0-1.2.noarch.rpm"
RPM_HASH = "4f6ad5683303a7ec120bd41b5d63e67d0b824f84409d947d868d556e8c36d9eefb254e0a2e2cc324ff81c5d608e58ce7098ecf363fdb2b7e8661daf55c2233ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dirty-equals \
python314-dirty-equals \
python3dist-dirty-equals"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
