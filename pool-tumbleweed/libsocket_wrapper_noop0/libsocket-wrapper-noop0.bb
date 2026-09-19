SUMMARY = "A library providing dummies for socket_wrapper"
DESCRIPTION = "Applications with the need to call socket_wrapper_enabled() should link against \
-lsocket_wrapper_noop in order to resolve the symbol at link time."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "libsocket_wrapper_noop0-1.5.2-1.5.aarch64.rpm"
RPM_HASH = "5677c3c6f959c2a08f29c9607422eb087a1a426be8e601fdf4d35000c8cba53386e41864530dbc69e57ce84938c17b53bb0bf60e4b6fc581883bc7d917856622"

RPROVIDES:${PN} += "libsocket-wrapper-noop.so.0 \
libsocket-wrapper-noop0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
