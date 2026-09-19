SUMMARY = "Official set of lenses for use by libaugeas"
DESCRIPTION = "Augeas parses configuration files described in lenses into a tree \
structure, which it exposes through its public API. Lenses are the \
building blocks of the file <-> tree transformation. The transformation \
is controlled by ``lens'' definitions that describe the file format and \
mapping of its contents into a tree. This package includes the official \
set of lenses."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "augeas-lenses-1.14.1-2.6.aarch64.rpm"
RPM_HASH = "3cfa576d851d71afc9e954cbb818c5d5b14fbe958e4700f2dd76d31582711aa97eb9ece900ff66cfab79d92b15b2ad18dc22236523f8c9202e516288c7baf498"

RPROVIDES:${PN} += "augeas-lenses"

RDEPENDS:${PN} += "libaugeas0"

inherit rpm
