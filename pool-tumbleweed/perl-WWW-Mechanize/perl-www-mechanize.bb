SUMMARY = "Handy web browsing in a Perl object"
DESCRIPTION = "'WWW::Mechanize', or Mech for short, is a Perl module for stateful \
programmatic web browsing, used for automating interaction with websites. \
 \
Features include: \
 \
* All HTTP methods \
* High-level hyperlink and HTML form support, without having to parse \
  HTML yourself \
* SSL support \
* Automatic cookies \
* Custom HTTP headers \
* Automatic handling of redirections \
* Proxies \
* HTTP authentication \
 \
Mech is well suited for use in testing web applications. If you use one of \
the Test::*, like Test::HTML::Lint modules, you can check the fetched \
content and use that as input to a test call."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.220.0"

RPM_NAME = "perl-WWW-Mechanize-2.220.0-1.3.noarch.rpm"
RPM_HASH = "05bf6c989e30a11cae30c32495e164996194345647de28a85f933a6530dfcdfc32a603c4f69e843e960a75843ec325c379fab762f6b4f2383d2b8a06356792ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--Mechanize \
perl-WWW--Mechanize--Image \
perl-WWW--Mechanize--Link \
perl-WWW-Mechanize"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-HTML--Form \
perl-HTML--HeadParser \
perl-HTML--TokeParser \
perl-HTML--TreeBuilder \
perl-HTTP--Cookies \
perl-HTTP--Message \
perl-HTTP--Request \
perl-HTTP--Request--Common \
perl-LWP--UserAgent \
perl-URI--URL \
perl-URI--file \
perl-parent"

inherit rpm
