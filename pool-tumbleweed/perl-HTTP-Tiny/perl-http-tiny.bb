SUMMARY = "Small, simple, correct HTTP/1.1 client"
DESCRIPTION = "This is a very simple HTTP/1.1 client, designed for doing simple requests \
without the overhead of a large framework like LWP::UserAgent. \
 \
It is more correct and more complete than HTTP::Lite. It supports proxies \
and redirection. It also correctly resumes after EINTR. \
 \
If IO::Socket::IP 0.25 or later is installed, HTTP::Tiny will use it \
instead of IO::Socket::INET for transparent support for both IPv4 and IPv6. \
 \
Cookie support requires HTTP::CookieJar or an equivalent class."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.096"

RPM_NAME = "perl-HTTP-Tiny-0.096-2.2.noarch.rpm"
RPM_HASH = "0e206c40ab44607f2892f72b67570a1ee2fc4d8fe25dac1f37155605a4f84ff7e40567928f9e54a4660c228b5696ed417589aa3b263d5df97ede385e52bb3db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Tiny \
perl-HTTP-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
