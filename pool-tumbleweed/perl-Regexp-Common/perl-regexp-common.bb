SUMMARY = "Provide commonly requested regular expressions"
DESCRIPTION = "By default, this module exports a single hash ('%RE') that stores or \
generates commonly needed regular expressions (see 'List of available \
patterns'). \
 \
There is an alternative, subroutine-based syntax described in \
'Subroutine-based interface'."
LICENSE = "Artistic-1.0 | Artistic-2.0 | BSD-3-Clause | MIT"

PV = "2024080801.0.0"

RPM_NAME = "perl-Regexp-Common-2024080801.0.0-1.10.noarch.rpm"
RPM_HASH = "e9ada2eb902ad3efbc765cfc56f0d679e3e5f5326ea90c986e175e4d11840f22e8d5080c56cfab6bcd1cc7b4ed618d0c081fc3d8c022d44f8d70d46671a2ff12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Regexp--Common \
perl-Regexp--Common---support \
perl-Regexp--Common--CC \
perl-Regexp--Common--Entry \
perl-Regexp--Common--SEN \
perl-Regexp--Common--URI \
perl-Regexp--Common--URI--RFC1035 \
perl-Regexp--Common--URI--RFC1738 \
perl-Regexp--Common--URI--RFC1808 \
perl-Regexp--Common--URI--RFC2384 \
perl-Regexp--Common--URI--RFC2396 \
perl-Regexp--Common--URI--RFC2806 \
perl-Regexp--Common--URI--fax \
perl-Regexp--Common--URI--file \
perl-Regexp--Common--URI--ftp \
perl-Regexp--Common--URI--gopher \
perl-Regexp--Common--URI--http \
perl-Regexp--Common--URI--news \
perl-Regexp--Common--URI--pop \
perl-Regexp--Common--URI--prospero \
perl-Regexp--Common--URI--tel \
perl-Regexp--Common--URI--telnet \
perl-Regexp--Common--URI--tv \
perl-Regexp--Common--URI--wais \
perl-Regexp--Common--balanced \
perl-Regexp--Common--comment \
perl-Regexp--Common--delimited \
perl-Regexp--Common--lingua \
perl-Regexp--Common--list \
perl-Regexp--Common--net \
perl-Regexp--Common--number \
perl-Regexp--Common--profanity \
perl-Regexp--Common--whitespace \
perl-Regexp--Common--zip \
perl-Regexp-Common"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
