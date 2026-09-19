SUMMARY = "HTTP::Tiny compatible HTTP client wrappers"
DESCRIPTION = "HTTP::Tinyish is a wrapper module for HTTP client modules LWP, HTTP::Tiny \
and HTTP client software 'curl' and 'wget'. \
 \
It provides an API compatible to HTTP::Tiny, and the implementation has \
been extracted out of App::cpanminus. This module can be useful in a \
restrictive environment where you need to be able to download CPAN modules \
without an HTTPS support in built-in HTTP library."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.200.0"

RPM_NAME = "perl-HTTP-Tinyish-0.200.0-1.3.noarch.rpm"
RPM_HASH = "3387d1c6fe9e4087c2f6097682be783d63c2a7726537882cb87c615faeaf548089490563a240ac61af4e1dfdbbad3e2d117dd0f655be63dbd3627bbb7b0c7409"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Tinyish \
perl-HTTP--Tinyish--Base \
perl-HTTP--Tinyish--Curl \
perl-HTTP--Tinyish--HTTPTiny \
perl-HTTP--Tinyish--LWP \
perl-HTTP--Tinyish--Wget \
perl-HTTP-Tinyish"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Which \
perl-HTTP--Tiny \
perl-IPC--Run3 \
perl-parent"

inherit rpm
