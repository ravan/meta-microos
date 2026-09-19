SUMMARY = "Pythonic IMAP client library"
DESCRIPTION = "IMAPClient is a Pythonic IMAP client library. \
 \
Features: \
    * Arguments and return values are natural Python types. \
    * IMAP server responses are parsed and readily usable. \
    * IMAP unique message IDs (UIDs) and internationalised \
      mailbox names are handled transparently. \
    * Time zones are handled. \
    * Convenience methods are provided for commonly used functionality. \
    * Exceptions are raised when errors occur. \
 \
IMAPClient includes comprehensive units tests and automated \
functional tests that can be run against a live IMAP server."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python314-IMAPClient-3.1.0-1.3.noarch.rpm"
RPM_HASH = "09f3a071e023892946eb4091bc4712086b197de94306276187f69a605714a2a435f0c0d1e3de7b18f39a193676d313b7cb958cf092ebe595a0ca0bb15dcee977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-imapclient \
python314-IMAPClient \
python3dist-imapclient"

RDEPENDS:${PN} += "python-abi"

inherit rpm
