SUMMARY = "Loadkit allows you to load arbitrary files within the Lua package path"
DESCRIPTION = "Loadkit lets you register new file extension handlers that \
can be opened with require, or you can just search for files \
of any extension using the current search path."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "luajit-loadkit-1.1.0-6.3.noarch.rpm"
RPM_HASH = "747e7d883cfea50f9d5d58f20dc93fecceae7a2830c1cd16d179ed3e9383a1384643598b969c6a990660217812b8a9ed505b5dd6a46c979973421ca1fd1a6877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-loadkit"

RDEPENDS:${PN} += "luajit"

inherit rpm
