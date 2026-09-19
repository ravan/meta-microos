SUMMARY = "A Linux vt console look-alike xterm wrapper"
DESCRIPTION = "This package contains the basic X.Org terminal program."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "xterm-console-1.1-3.5.noarch.rpm"
RPM_HASH = "b28b2a13b11c6aa66d84d2e3906a9f1ce7157027101969d26a5702f6865877610b766cef178c0acd46bfde4f6e651242ab10022c2f930391fcdd4a10d6c23b28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xterm-console"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
aaa-base \
coreutils \
fonts-config \
perl"

inherit rpm
