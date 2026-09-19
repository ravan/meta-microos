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

RPM_NAME = "python313-IMAPClient-3.1.0-1.3.noarch.rpm"
RPM_HASH = "916937a64c5c6f8000cbaec2fcab1891ac7399426c0feaebd188442c9d9ff4f2515d4377a96e0c855b96b7a0a8e693299c8b80e9a291c4ba50ab48d9feb69106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-IMAPClient \
python3.13dist-imapclient \
python313-IMAPClient \
python3dist-imapclient"

RDEPENDS:${PN} += "python-abi"

inherit rpm
