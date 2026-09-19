SUMMARY = "Emacs-based e-mail client based on the mu e-mail indexer/searcher"
DESCRIPTION = "mu4e is an emacs-based e-mail client. It is based on the mu e-mail indexer/searcher."
LICENSE = "GPL-3.0-or-later"

PV = "1.14.3"

RPM_NAME = "mu4e-1.14.3-1.1.noarch.rpm"
RPM_HASH = "5c03e324f64de735aacfc4037f9af05efbeafe6bba6cbbd77003aa8e0d81a750094aa827a6fd8a1eb921d9fb3d0174a6f3c1fa8eae75963435b0a709b6a947fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mu4e"

RDEPENDS:${PN} += "/usr/bin/sh \
maildir-utils"

inherit rpm
