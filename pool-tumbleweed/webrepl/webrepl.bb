SUMMARY = "Tool similar to ssh/scp for MicroPython devices running WebREPL"
DESCRIPTION = "WebREPL client, for accessing a MicroPython REPL (interactive prompt) \
as well as transfering files over WebSockets."
LICENSE = "MIT"

PV = "20221108.1e09d9a"

RPM_NAME = "webrepl-20221108.1e09d9a-1.6.noarch.rpm"
RPM_HASH = "8150445e278d0371ac092199949a8e0bc08df7c7833ec875662d919bbbb5800ea0ba665068a6b3e0f216b23b9be7c247b61aed73dcf0665b2ccf77b4b59028af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "webrepl"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
