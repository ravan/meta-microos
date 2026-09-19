SUMMARY = "Low-level HTTP connection (client)"
DESCRIPTION = "The 'Net::HTTP' class is a low-level HTTP client. An instance of the \
'Net::HTTP' class represents a connection to an HTTP server. The HTTP \
protocol is described in RFC 2616. The 'Net::HTTP' class supports \
'HTTP/1.0' and 'HTTP/1.1'. \
 \
'Net::HTTP' is a sub-class of one of 'IO::Socket::IP' (IPv6+IPv4), \
'IO::Socket::INET6' (IPv6+IPv4), or 'IO::Socket::INET' (IPv4 only). You can \
mix the methods described below with reading and writing from the socket \
directly. This is not necessary a good idea, unless you know what you are \
doing."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.240.0"

RPM_NAME = "perl-Net-HTTP-6.240.0-1.5.noarch.rpm"
RPM_HASH = "2de3582b65d4b40c8461af707db0c18c1075e6337c6e08443806ca9cd7d718710d05668571b00de71797861e5cbed9113023794c7d9860ff242f15c013cc65c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--HTTP \
perl-Net--HTTP--Methods \
perl-Net--HTTP--NB \
perl-Net--HTTPS \
perl-Net-HTTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Compress--Raw--Zlib \
perl-IO--Uncompress--Gunzip \
perl-URI"

inherit rpm
