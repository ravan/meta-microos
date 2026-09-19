SUMMARY = "Development files for py3c"
DESCRIPTION = "py3c helps porting C extensions to Python 3."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "py3c-devel-1.4-2.5.noarch.rpm"
RPM_HASH = "ab148c4ccab01eb12428ce394b823e4864727bb728551228bafb959fc310b2a33991db1fc03c4e7a2aff9304622a21ed06f60ba1e09913afdc8dacb42443ef41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-py3c \
py3c-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
