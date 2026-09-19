SUMMARY = "Paste On Www.Pastebin.Com Without Api Keys"
DESCRIPTION = "This module provides the means to paste on the www.pastebin.com manpage \
pastebin, without the need for http://pastebin.com/api. See the WARNING!!! \
section above."
LICENSE = "Artistic-2.0"

PV = "1.003"

RPM_NAME = "perl-WWW-Pastebin-PastebinCom-Create-1.003-1.40.noarch.rpm"
RPM_HASH = "e92c3f80f221ff19ed4f01250ad8199c38f7609a9484eb639edb84ec7b90bfb901cf6f8136b9c141d21317efc9b2e013b709e77c7d56c50112142af37c087b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--Pastebin--PastebinCom--Create \
perl-WWW-Pastebin-PastebinCom-Create"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moo \
perl-WWW--Mechanize"

inherit rpm
