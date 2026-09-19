SUMMARY = "CMUScheme48 emacs mode"
DESCRIPTION = "Scheme process in a buffer.  Adapted from cmuscheme.el"
LICENSE = "BSD-3-Clause"

PV = "1.9.3"

RPM_NAME = "emacs-scheme48-1.9.3-1.14.aarch64.rpm"
RPM_HASH = "d0de774e2f9794d769122aa56c7e996b7ccd19fbcf6ad7d924a89bd901e25e667d65f42dc5949dd59eb70f3e9367d020a72ac8978eda38995fd236bd5735c54a"

RPROVIDES:${PN} += "emacs-scheme48"

RDEPENDS:${PN} += "scheme48"

inherit rpm
