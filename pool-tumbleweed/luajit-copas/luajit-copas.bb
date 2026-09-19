SUMMARY = "Coroutine Oriented Portable Asynchronous Services"
DESCRIPTION = "Copas is a dispatcher based on coroutines that can be used by TCP/IP \
servers. It uses LuaSocket as the interface with the TCP/IP stack. \
A server registered with Copas should provide a handler for requests and \
use Copas socket functions to send the response. Copas loops through \
requests and invokes the corresponding handlers. For a full \
implementation of a Copas HTTP server you can refer to Xavante as an \
example."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "luajit-copas-2.0.2-6.2.noarch.rpm"
RPM_HASH = "7521249aeebea46e84a74ace09df8bf188b1eb5ee85bed602e4723e9ff84f4cf47828b04fd16a34542f87917891ade5667c6087127602389524304806b1c423a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-copas"

RDEPENDS:${PN} += "luajit"

inherit rpm
