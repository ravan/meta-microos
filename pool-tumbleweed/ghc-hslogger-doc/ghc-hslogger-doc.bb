SUMMARY = "Haskell hslogger library documentation"
DESCRIPTION = "This package provides the Haskell hslogger library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.0"

RPM_NAME = "ghc-hslogger-doc-1.3.2.0-1.9.noarch.rpm"
RPM_HASH = "9b5884ce2fdf98f5eea6af2a1513e82a50511bae7cf1fbcc019ae34587d5241f444a3a355de4cf3327f000bea414a090044360357a175602de52e3e371a81f8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslogger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
