SUMMARY = "Command line utility to convert Int. Domain Names"
DESCRIPTION = "GNU Libidn is an implementation of the Stringprep, Punycode, and IDNA \
specifications defined by the IETF Internationalized Domain Names \
(IDN) working group. It is used to prepare internationalized strings \
(such as domain name labels, usernames, and passwords) in order to \
increase the likelihood that string input and string comparison work \
in ways that make sense for typical users around the world. The \
library contains a generic Stringprep implementation that does \
Unicode 3.2 NFKC normalization, mapping and prohibition of \
characters, and bidirectional character handling. Profiles for iSCSI, \
Kerberos 5, Nameprep, SASL, and XMPP are included. Punycode and ASCII \
Compatible Encoding (ACE) via IDNA is supported."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "1.44"

RPM_NAME = "libidn-tools-1.44-1.3.aarch64.rpm"
RPM_HASH = "47aff0fefc797709231bd068be52cdfb3d65cb649ccee0ab478134bb580b474a67cc0bdde484871692da613b81765ecec4cc7ac4c3d1218404f48768655f1956"

RPROVIDES:${PN} += "libidn-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn.so.12"

inherit rpm
