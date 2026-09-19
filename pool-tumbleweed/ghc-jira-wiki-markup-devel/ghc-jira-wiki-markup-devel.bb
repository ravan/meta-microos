SUMMARY = "Haskell jira-wiki-markup library development files"
DESCRIPTION = "This package provides the Haskell jira-wiki-markup library development \
files."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-devel-1.5.1-2.27.aarch64.rpm"
RPM_HASH = "a621622bfe20760fdca92bd8e7048b62abe8016d2f98c0dc9becf4e25ef28c6ab410568eaa3a9d68f723c0a307d06f654dc52853087cd8447024bebd93006884"

RPROVIDES:${PN} += "ghc-devel-jira-wiki-markup-1.5.1-98GFxAn8YwIIHGuEhvyDFl \
ghc-jira-wiki-markup-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-text-2.1.4-cf23 \
ghc-jira-wiki-markup"

inherit rpm
