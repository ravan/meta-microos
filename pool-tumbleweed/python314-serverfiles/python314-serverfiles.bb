SUMMARY = "A utility to locally store files on a HTTP server"
DESCRIPTION = "A utility that accesses files on an HTTP server and stores them \
locally for reuse."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python314-serverfiles-0.3.1-2.5.noarch.rpm"
RPM_HASH = "c16c5d180839cea93e7d364836b5270094c69f558600729a2fbeea5c75e526c55e9e21d7936ecce6c762dd6433654fe701ccb896df050a0274e9e297a5e0595a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-serverfiles \
python314-serverfiles \
python3dist-serverfiles"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
