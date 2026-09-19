SUMMARY = "Loadkit allows you to load arbitrary files within the Lua package path"
DESCRIPTION = "Loadkit lets you register new file extension handlers that \
can be opened with require, or you can just search for files \
of any extension using the current search path."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua55-loadkit-1.1.0-6.3.noarch.rpm"
RPM_HASH = "2e56316466cd4a2738bffd386b5549574cfe9faac1321f3bf2763f29567371cded2cb3ab51f241b77269fc3da0fbbeee35ac1f74bce2f3f09b5ef438d5aef313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-loadkit"

RDEPENDS:${PN} += "lua55"

inherit rpm
