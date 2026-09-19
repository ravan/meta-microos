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

RPM_NAME = "lua53-copas-2.0.2-6.2.noarch.rpm"
RPM_HASH = "e69148c43b6be305f19bfc737c320e44aef51bcf3498f2cfcac28a0cee2fad2405bef784b51ea20e212878062ece963a6f21a45a0f23913be7fba022a448bd93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-copas"

RDEPENDS:${PN} += "lua53"

inherit rpm
