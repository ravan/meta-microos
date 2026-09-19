SUMMARY = "Simple but non-blocking HTTP/HTTPS client"
DESCRIPTION = "This module is an AnyEvent user, you need to make sure that you use and run \
a supported event loop. \
 \
This module implements a simple, stateless and non-blocking HTTP client. It \
supports GET, POST and other request methods, cookies and more, all on a \
very low level. It can follow redirects, supports proxies, and \
automatically limits the number of connections to the values specified in \
the RFC. \
 \
It should generally be a 'good client' that is enough for most HTTP tasks. \
Simple tasks should be simple, but complex tasks should still be possible \
as the user retains control over request and response headers. \
 \
The caller is responsible for authentication management, cookies (if the \
simplistic implementation in this module doesn't suffice), referer and \
other high-level protocol details for which this module offers only limited \
support."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.250.0"

RPM_NAME = "perl-AnyEvent-HTTP-2.250.0-1.7.noarch.rpm"
RPM_HASH = "1f2b4f0435f0bbe36f71db76c2c8f712bdfe7a280c5225a43e04aeb86df47c04e4c58d695f3056e9f87f22ca5ffcf01ea03b6fa4d7ab52c86f7da389e4017ab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--HTTP \
perl-AnyEvent-HTTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-AnyEvent \
perl-common--sense"

inherit rpm
