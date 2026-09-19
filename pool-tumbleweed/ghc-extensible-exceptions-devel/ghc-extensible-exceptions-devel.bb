SUMMARY = "Haskell extensible-exceptions library development files"
DESCRIPTION = "This package provides the Haskell extensible-exceptions library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-devel-0.1.1.4-7.23.aarch64.rpm"
RPM_HASH = "fe2a8629295e1d1bceef113a689609ef48378ece471765672f481539773b7ead557a576b93a44a3fcd22ce1a5be408470437237f9f6736238978adbd8a140da1"

RPROVIDES:${PN} += "ghc-devel-extensible-exceptions-0.1.1.4-1DqJiZkXnDRHRXNZtok1ZU \
ghc-extensible-exceptions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-extensible-exceptions"

inherit rpm
