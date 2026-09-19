SUMMARY = "Info files for GNU Emacs"
DESCRIPTION = "This package contains all the Info files for GNU Emacs. These files can \
be read online with GNU Emacs. They describe Emacs and some of its \
modes."
LICENSE = "GPL-3.0-or-later"

PV = "31.1"

RPM_NAME = "emacs-info-31.1-3.1.noarch.rpm"
RPM_HASH = "583198224565c3e5fa1dd386cf197e4b525e720b3867b5e6589d8ffb4060b7ca64f584a6e9912824e354cbfe2c34ece086dc1f4560ca6fa61f042a91db0d170f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-info"

RDEPENDS:${PN} += ""

inherit rpm
