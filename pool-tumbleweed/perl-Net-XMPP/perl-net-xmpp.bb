SUMMARY = "XMPP Perl Library"
DESCRIPTION = "Net::XMPP is a convenient tool to use for any perl script that would like \
to utilize the XMPP Instant Messaging protocol. While not a client in and \
of itself, it provides all of the necessary back-end functions to make a \
CGI client or command-line perl client feasible and easy to use. Net::XMPP \
is a wrapper around the rest of the official Net::XMPP::xxxxxx packages. \
 \
There is are example scripts in the example directory that provide you with \
examples of very simple XMPP programs. \
 \
NOTE: The parser that the XML::Stream::Parser manpage provides, as are most \
Perl parsers, is synchronous. If you are in the middle of parsing a packet \
and call a user defined callback, the Parser is blocked until your callback \
finishes. This means you cannot be operating on a packet, send out another \
packet and wait for a response to that packet. It will never get to you. \
Threading might solve this, but as of this writing threading in Perl is not \
quite up to par yet. This issue will be revisted in the future."
LICENSE = "LGPL-2.1+"

PV = "1.05"

RPM_NAME = "perl-Net-XMPP-1.05-1.39.noarch.rpm"
RPM_HASH = "5c4499494d9f9f90f25952e3727f125eebfa9add5372085a78184c7e655b14f4d49d0894b338184b5d1ccbd69be6e5c5e72fec0d3c12df2d15bc74e74c8cd956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--XMPP \
perl-Net--XMPP--Client \
perl-Net--XMPP--Connection \
perl-Net--XMPP--Debug \
perl-Net--XMPP--IQ \
perl-Net--XMPP--JID \
perl-Net--XMPP--Message \
perl-Net--XMPP--Namespaces \
perl-Net--XMPP--Presence \
perl-Net--XMPP--PrivacyLists \
perl-Net--XMPP--Protocol \
perl-Net--XMPP--Roster \
perl-Net--XMPP--Stanza \
perl-Net-XMPP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Authen--SASL \
perl-Digest--SHA \
perl-XML--Stream"

inherit rpm
