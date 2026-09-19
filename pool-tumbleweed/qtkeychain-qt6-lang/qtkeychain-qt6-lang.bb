SUMMARY = "Translations for package qtkeychain-qt6"
DESCRIPTION = "Provides translations for the 'qtkeychain-qt6' package."
LICENSE = "BSD-2-Clause"

PV = "0.17.0"

RPM_NAME = "qtkeychain-qt6-lang-0.17.0-1.1.noarch.rpm"
RPM_HASH = "44af8cd98c8ac9766ddf5df6b38e565b8f8eed5f02e9249f15cd839a2bc421af61757778249eb68558aa85d906162cdfe54918708b0e99b6045b49e2775361c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qtkeychain-qt6-lang \
qtkeychain-qt6-lang-all"

RDEPENDS:${PN} += "libqt6keychain1"

inherit rpm
