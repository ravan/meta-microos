SUMMARY = "Support for Internationalized Domain Names (IDN)"
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

RPM_NAME = "libidn12-1.44-1.3.aarch64.rpm"
RPM_HASH = "8b3430b20623937ff684f543c8ec88904f9b2da7dacaf9982ad6e66764eece12215aef9de1e20aa21c44e5188c8d6c2bbba35ca3b12a2ba6ddb3e9f9a87b35d6"

RPROVIDES:${PN} += "libidn \
libidn.so.12 \
libidn12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
