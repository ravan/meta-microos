SUMMARY = "Faster moving Wayland protocols"
DESCRIPTION = "frog-protocols contains Wayland protocol definitions for protocols \
being developed in a more agile fashion to enable shipping \
functionality to users more quickly. It is intended to \
accelerate development of formal Wayland protocols."
LICENSE = "MIT"

PV = "0.01"

RPM_NAME = "frog-protocols-0.01-1.6.noarch.rpm"
RPM_HASH = "22728991fffd418783e44f53e5b57929fc8e2346b2920a5a4c38a272b00275a10b24fe3a89ebe4e79333c7e086dc277d202a3316662b854aa0ada8ec7111941b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frog-protocols \
frog-protocols-devel \
pkgconfig-frog-protocols"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
