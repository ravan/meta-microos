SUMMARY = "Development files for libidn"
DESCRIPTION = "GNU Libidn is an implementation of the Stringprep, Punycode, and IDNA \
specifications defined by the IETF Internationalized Domain Names (IDN) \
working group. It is used to prepare internationalized strings (such as \
domain name labels, usernames, and passwords) in order to increase the \
likelihood that string input and string comparison work in ways that \
make sense for typical users around the world. The library contains a \
generic Stringprep implementation that does Unicode 3.2 NFKC \
normalization, mapping and prohibition of characters, and bidirectional \
character handling. Profiles for iSCSI, Kerberos 5, Nameprep, SASL, and \
XMPP are included. Punycode and ASCII Compatible Encoding (ACE) via \
IDNA is supported."
LICENSE = "LGPL-2.1-or-later"

PV = "1.44"

RPM_NAME = "libidn-devel-1.44-1.3.aarch64.rpm"
RPM_HASH = "e9826ab54eef415900da4f13b2b7299700e219c14a465d0879620c8a79e65f9766210a59bf8411bd06c6597ee1632454fcd72a8058f87dcbc0dd99332cb6d029"

RPROVIDES:${PN} += "libidn-devel \
pkgconfig-libidn"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libidn12"

inherit rpm
