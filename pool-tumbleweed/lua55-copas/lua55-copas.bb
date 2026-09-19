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

RPM_NAME = "lua55-copas-2.0.2-6.2.noarch.rpm"
RPM_HASH = "7510f911983ff189bb35c1cfde6be092105a93bdc0be2263cd3737442ff1ef2174188f866bfa96305e22e9797668e547c6df12229cee8e2f7eb6da5942ff745b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-copas"

RDEPENDS:${PN} += "lua55"

inherit rpm
