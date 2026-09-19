SUMMARY = "Jabber Perl Library"
DESCRIPTION = "  Net::Jabber is a convenient tool to use for any perl script that would \
  like to utilize the Jabber Instant Messaging protocol.  While not a \
  client in and of itself, it provides all of the necessary back-end \
  functions to make a CGI client or command-line perl client feasible and \
  easy to use.  Net::Jabber is a wrapper around the rest of the official \
  Net::Jabber::xxxxxx packages. \
 \
  There is are example scripts in the example directory that provide you \
  with examples of very simple Jabber programs. \
 \
 \
  NOTE: The parser that XML::Stream::Parser provides, as are most Perl \
  parsers, is synchronous.  If you are in the middle of parsing a packet \
  and call a user defined callback, the Parser is blocked until your \
  callback finishes.  This means you cannot be operating on a packet, \
  send out another packet and wait for a response to that packet.  It \
  will never get to you.  Threading might solve this, but as of the \
  writing of this, threading in Perl is not quite up to par yet.  This \
  issue will be revisted in the future."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0.0"

RPM_NAME = "perl-Net-Jabber-2.0.0-1.9.noarch.rpm"
RPM_HASH = "df7f7be6f018ee24250c5d5fb3a1e682624c9fc3f357a5df76ba1db9aa2c2c19a074566da6c407f293aa79b33730ef984d5f54919161d76d311b3790f33a37a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Jabber \
perl-Net--Jabber--Client \
perl-Net--Jabber--Component \
perl-Net--Jabber--Data \
perl-Net--Jabber--Debug \
perl-Net--Jabber--Dialback \
perl-Net--Jabber--Dialback--Result \
perl-Net--Jabber--Dialback--Verify \
perl-Net--Jabber--IQ \
perl-Net--Jabber--JID \
perl-Net--Jabber--Key \
perl-Net--Jabber--Log \
perl-Net--Jabber--Message \
perl-Net--Jabber--Namespaces \
perl-Net--Jabber--Presence \
perl-Net--Jabber--Protocol \
perl-Net--Jabber--Server \
perl-Net--Jabber--Stanza \
perl-Net--Jabber--XDB \
perl-Net-Jabber \
perl-Test--Builder \
perl-Test--More \
perl-Test--Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Net--XMPP"

inherit rpm
