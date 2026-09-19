SUMMARY = "Internationalised Usernames and Passwords"
DESCRIPTION = "The PRECIS framework makes internationalised user names and \
passwords safer for use by applications. PRECIS profiles transform \
unicode strings into a canonical form, suitable for comparison. \
 \
This module implements the PRECIS Framework as described in: \
 - PRECIS Framework: Preparation, Enforcement, and Comparison of \
   Internationalized Strings in Application Protocols (RFC 8264). \
 - Preparation, Enforcement, and Comparison of Internationalized \
   Strings Representing Usernames and Passwords (RFC 8265). \
 - Preparation, Enforcement, and Comparison of Internationalized \
   Strings Representing Nicknames (RFC 8266)."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python313-precis-i18n-1.1.2-1.4.noarch.rpm"
RPM_HASH = "3a591d4afcc79d379294f92260131bb50469ec75c13a1f20e1bbd62ca4ea0c501fd8ad16c88d94344a978008621e82261f28c83077b850315fcc4bcac7a766a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-precis-i18n \
python3.13dist-precis-i18n \
python313-precis-i18n \
python3dist-precis-i18n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
