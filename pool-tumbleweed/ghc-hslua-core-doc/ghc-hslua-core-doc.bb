SUMMARY = "Haskell hslua-core library documentation"
DESCRIPTION = "This package provides the Haskell hslua-core library documentation."
LICENSE = "MIT"

PV = "2.3.2.1"

RPM_NAME = "ghc-hslua-core-doc-2.3.2.1-1.3.noarch.rpm"
RPM_HASH = "ba8cc80296ef8cdfe1d1ca3f2fd36c830fcba6eb0abfdffd91bda0eb217df2ce79b3d58925201057e7995d9495bf6ff0d8512140ab26094990ec0219beaa0e39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
