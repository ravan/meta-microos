SUMMARY = "WebSocket server for AnyEvent"
DESCRIPTION = "This class is an implementation of the WebSocket server in an AnyEvent \
context. \
 \
  * Currently this module supports WebSocket protocol version 13 only. See at \
https://tools.ietf.org/html/rfc6455 for detail."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.100.0"

RPM_NAME = "perl-AnyEvent-WebSocket-Server-0.100.0-1.7.noarch.rpm"
RPM_HASH = "e4a82411f9d03619a7c0391de2e6d588a3e68cc5263197625398c855784f8a50e22949682a3aa56dfda0f2dfd617a3033f1a7018d328e8991c6f12623252e527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--WebSocket--Server \
perl-AnyEvent-WebSocket-Server"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-AnyEvent--Handle \
perl-AnyEvent--WebSocket--Client \
perl-Protocol--WebSocket--Handshake--Server \
perl-Try--Tiny"

inherit rpm
