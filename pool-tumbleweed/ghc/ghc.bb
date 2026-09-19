SUMMARY = "The Glorious Glasgow Haskell Compiler"
DESCRIPTION = "Haskell is the standard purely functional programming language; the \
current language version is Haskell 98, agreed in December 1998. \
 \
GHC is a state-of-the-art programming suite for Haskell.  Included is \
an optimising compiler generating good code for a variety of \
platforms, together with an interactive system for convenient, quick \
development.  The distribution includes space and time profiling \
facilities, a large collection of libraries, and support for various \
language extensions, including concurrency, exceptions, and foreign \
language interfaces (C, C++, etc). \
 \
A wide variety of Haskell related resources (tutorials, libraries, \
specifications, documentation, compilers, interprbeters, references, \
contact information, links to research groups) are available from the \
Haskell home page at <http://www.haskell.org/>."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-9.12.4-1.3.aarch64.rpm"
RPM_HASH = "b0cfe7fae99203331fc009aee6f9c16e49f06897628f8e4c6b126383317af1b78cb8755f0dd8e328741eae037f60a3e87ae9882fd17a3cd657c7234b6832a630"

RPROVIDES:${PN} += "ghc"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel \
ghc-ghc-boot-devel \
ghc-ghc-compact-devel \
ghc-ghc-devel \
ghc-ghc-heap-devel \
ghc-ghci-devel \
ghc-hpc-devel"

inherit rpm
