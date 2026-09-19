SUMMARY = "Convert Cabal files into rpm spec files"
DESCRIPTION = "Convert Cabal files into a \
<http://ftp.rpm.org/max-rpm/s1-rpm-build-creating-spec-file.html spec file> \
suitable for building the package with the RPM package manager. This tool \
primarily targets the <http://www.suse.com/ SUSE> and <http://www.opensuse.org \
openSUSE> familiy of distributions. Support for other RPM-based distributions \
is currently not available. Check out \
<http://hackage.haskell.org/package/cabal-rpm cabal-rpm> if you need this."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "cabal2spec-2.8.0-1.9.aarch64.rpm"
RPM_HASH = "e9da2e02cff0e98f6c27fb890a0ea9fb9efabf6b54e40bb7fbd10d7848624f6deca6a02a2e463ef95194eea907b539dfffcdb3476419d26efa7bc8857c9d8f40"

RPROVIDES:${PN} += "cabal2spec"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
