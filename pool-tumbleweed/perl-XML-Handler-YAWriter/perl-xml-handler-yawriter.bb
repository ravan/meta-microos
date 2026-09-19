SUMMARY = "Yet another Perl SAX XML Writer"
DESCRIPTION = "YAWriter implements Yet Another XML::Handler::Writer. The reasons for this \
one are that I needed a flexible escaping technique, and want some kind of \
pretty printing. If an instance of YAWriter is created without any options, \
the default behavior is to produce an array of strings containing the XML \
in : \
 \
  @{$ya->{Strings}}"
LICENSE = "GPL-1.0+"

PV = "0.23"

RPM_NAME = "perl-XML-Handler-YAWriter-0.23-5.42.noarch.rpm"
RPM_HASH = "57c781dfa4d0657143d4d68b6df2882f32afd2b950bee7f2033c5700fcd15c3e1ed66b71925d023a275c2ceea4bae5dca0ebb38eeb58ba7c3c189e5e1de6e4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Handler--YAWriter \
perl-XML-Handler-YAWriter"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-XML--Parser--PerlSAX"

inherit rpm
