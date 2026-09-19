SUMMARY = "WebSocket client for AnyEvent"
DESCRIPTION = "This class provides an interface to interact with a web server that \
provides services via the WebSocket protocol in an AnyEvent context. It \
uses Protocol::WebSocket rather than reinventing the wheel. You could use \
AnyEvent and Protocol::WebSocket directly if you wanted finer grain \
control, but if that is not necessary then this class may save you some \
time. \
 \
The recommended API was added to the AnyEvent::WebSocket::Connection class \
with version 0.12, so it is recommended that you include that version when \
using this module. The older version of the API has since been deprecated \
and removed."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.550.0"

RPM_NAME = "perl-AnyEvent-WebSocket-Client-0.550.0-1.7.noarch.rpm"
RPM_HASH = "78c6fb333f08e003d921ca4af09bd678b13a01d6ae0118067b28bda8162459fe0fd3f8c6c6d9774d6e81c1a52a4603381901af0520dc7caf8b3381078ce20fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--WebSocket--Client \
perl-AnyEvent--WebSocket--Connection \
perl-AnyEvent--WebSocket--Message \
perl-AnyEvent-WebSocket-Client \
perl-Test2--Plugin--AnyEvent--Timeout \
perl-Test2--Plugin--EV \
perl-Test2--Require--NotWindows \
perl-Test2--Require--SSL \
perl-Test2--Tools--WebSocket--Connection \
perl-Test2--Tools--WebSocket--Mojo \
perl-Test2--Tools--WebSocket--Server"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-AnyEvent \
perl-AnyEvent--Connector \
perl-Moo \
perl-PerlX--Maybe \
perl-Protocol--WebSocket \
perl-URI \
perl-URI--ws"

inherit rpm
