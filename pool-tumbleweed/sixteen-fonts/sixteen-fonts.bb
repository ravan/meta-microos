SUMMARY = "A font inspired by 16-segment LED displays"
DESCRIPTION = "Sixteen is a monospaced font inspired by the aesthetics of 16-segment LED \
displays, suitable for technical and decorative use."
LICENSE = "OFL-1.1"

PV = "1.0"

RPM_NAME = "sixteen-fonts-1.0-1.1.noarch.rpm"
RPM_HASH = "21d009d9994e5fd0930c1a8df4d52f534163debdda01a0b59c5266056917d898239d3ef1d57d21e2a02f8ea054e5ad33addbdceecd49df5d78dfdba31676a339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sixteen-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
