SUMMARY = "Changelog link and timestamp adding Sphinx plugin"
DESCRIPTION = "rst.linker is a Sphinx plugin to add links and timestamps to the \
changelog."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python314-rst.linker-2.4.0-3.5.noarch.rpm"
RPM_HASH = "58c0dce2c5a1a3181897d6593cfecffddb93554367f6cbb26563885d7d9615c7c03fdd14d89d1c9ec70bc3444e9e8a28c72a7938091bddb1a605fa64c56996d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rst.linker \
python314-rst.linker \
python3dist-rst.linker"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil"

inherit rpm
