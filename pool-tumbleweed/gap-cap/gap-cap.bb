SUMMARY = "GAP: Categories, Algorithms and Programming"
DESCRIPTION = "CAP is a package for category theory. It facilitates the \
implementation of specific instances of categories and provides a \
language for writing generic categorical algorithms."
LICENSE = "GPL-2.0-only"

PV = "2026.05.08"

RPM_NAME = "gap-cap-2026.05.08-1.2.noarch.rpm"
RPM_HASH = "2e5b769c7d4850255c87ce41b468a4bb3d23b4ae4041d5ede52509d083b1929337313a3fc9bfe2e43784386bcb6ef31cb1eed7cfcd29436f52ab7bbb586ae848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-cap"

RDEPENDS:${PN} += "gap-core \
gap-io \
gap-toolsforhomalg"

inherit rpm
