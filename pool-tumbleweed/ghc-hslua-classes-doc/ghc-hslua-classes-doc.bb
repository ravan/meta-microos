SUMMARY = "Haskell hslua-classes library documentation"
DESCRIPTION = "This package provides the Haskell hslua-classes library documentation."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "ghc-hslua-classes-doc-2.3.2-1.2.noarch.rpm"
RPM_HASH = "4fcbfa91a5b4f32c91cbddc3bdacf426c6980d913ce86eac58e67bae96ff5caa9904162d8463f29658986156eaf810db62fe3ad319e5b15436633514cf98da81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-classes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
