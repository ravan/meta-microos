SUMMARY = "Changelog link and timestamp adding Sphinx plugin"
DESCRIPTION = "rst.linker is a Sphinx plugin to add links and timestamps to the \
changelog."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python313-rst.linker-2.4.0-3.5.noarch.rpm"
RPM_HASH = "826c143fe85ae7fbb61893399e223c29e7d4dbd9644b415da3e8ae2c7e102a415beab24125456b76a09b18955215d573f00125ee4ad83e094b5263b6b8153447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rst.linker \
python3.13dist-rst.linker \
python313-rst.linker \
python3dist-rst.linker"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil"

inherit rpm
