SUMMARY = "Translations for package qsynth"
DESCRIPTION = "Provides translations for the 'qsynth' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.6"

RPM_NAME = "qsynth-lang-1.0.6-1.2.noarch.rpm"
RPM_HASH = "dcfb0c061e36a1f7343e4a94d71c6dbce6155e4f1eeaf9d4d5102cdc3beb2f139e3fa4e00bbda0b6d46f1b88753debb7338894c5643a208b2cdefbc3b0803bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qsynth-lang \
qsynth-lang-all"

RDEPENDS:${PN} += "qsynth"

inherit rpm
