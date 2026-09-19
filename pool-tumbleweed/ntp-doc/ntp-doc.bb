SUMMARY = "Additional Package Documentation for ntp"
DESCRIPTION = "The complete set of documentation for building and configuring an NTP \
server or client. The documentation is in the form of HTML files \
suitable for browsing and contains links to additional documentation at \
various web sites. \
 \
What about NTP? Understanding and using the Network Time Protocol (A \
first try on a non-technical Mini-HOWTO and FAQ on NTP). Edited by \
Ulrich Windl and David Dalton."
LICENSE = "BSD-3-Clause & MIT & BSD-4-Clause & GPL-2.0-only"

PV = "4.2.8p18"

RPM_NAME = "ntp-doc-4.2.8p18-3.3.aarch64.rpm"
RPM_HASH = "4ffaa59762aef8d5af4a912566200dec79ef1b586f94ce3984e61fff9527ef401ba5807bd44a9676a57a787335be05f8cd0efb19d959b6270507145de10df525"

RPROVIDES:${PN} += "ntp-doc \
ntpdoc \
xntp-doc \
xntpdoc"

RDEPENDS:${PN} += ""

inherit rpm
