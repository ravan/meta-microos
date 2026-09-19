SUMMARY = "Program to fill the console with Wall Street-like news and stats"
DESCRIPTION = "This utility will split the console into a multiple panes of news \
and statistics, like any good computer screen on Wall Street."
LICENSE = "Apache-2.0"

PV = "1.25"

RPM_NAME = "wallstreet-1.25-1.2.noarch.rpm"
RPM_HASH = "874d49ce95086f4f276a1698b6412beea65ebb39e5b1c579c6faebbae01505a66735f5a071baba920e10603f758089c95c7b9482edef5ad9ff819d0f1d423abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wallstreet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
perl-base \
wget"

inherit rpm
