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

RPM_NAME = "lua54-copas-2.0.2-6.2.noarch.rpm"
RPM_HASH = "7c3f0557e8ac3ff5ce6bb9be2c4c4f89a8388e4d9c8a49781e0df58d6404c2b291d7e0dd060b1dacb6bce90b5aa53378bb68c83058462f86e096bb87ad4c075c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-copas \
lua54-copas"

RDEPENDS:${PN} += "lua54"

inherit rpm
