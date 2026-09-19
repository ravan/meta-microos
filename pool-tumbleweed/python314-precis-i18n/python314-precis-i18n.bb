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

RPM_NAME = "python314-precis-i18n-1.1.2-1.4.noarch.rpm"
RPM_HASH = "524e44e0bee2c476ce475861fca8cfaffb1539e9365aa5244b9aa865a80b5a5d38ec7a800f3042b33cb3d3ac1c91dfa3ab27b783e39017f54bc542cf695e6885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-precis-i18n \
python314-precis-i18n \
python3dist-precis-i18n"

RDEPENDS:${PN} += "python-abi"

inherit rpm
