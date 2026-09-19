SUMMARY = "Loadkit allows you to load arbitrary files within the Lua package path"
DESCRIPTION = "Loadkit lets you register new file extension handlers that \
can be opened with require, or you can just search for files \
of any extension using the current search path."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua53-loadkit-1.1.0-6.3.noarch.rpm"
RPM_HASH = "53d97e38c9ef8aa0cad9504b5cf29ada9074f81460acc8d8e23e8ebd7c7f06eb46439dfb80d63b19b0f62b954f570d0fb11b1dcb0496b446fdb20764c9df5fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-loadkit"

RDEPENDS:${PN} += "lua53"

inherit rpm
