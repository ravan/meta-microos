SUMMARY = "Haskell jira-wiki-markup profiling library"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup profiling library."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-prof-1.5.1-2.27.aarch64.rpm"
RPM_HASH = "6be3199c3869c6b41b2eb7660eb96fcf3ca84bc9d84864ae2248ecee2c22d9298b89d9193733d9d81608e55ca5f0b53eecda78fc8f80a26325174cd7982c6862"

RPROVIDES:${PN} += "ghc-jira-wiki-markup-prof \
ghc-prof-jira-wiki-markup-1.5.1-98GFxAn8YwIIHGuEhvyDFl"

RDEPENDS:${PN} += "ghc-jira-wiki-markup-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
