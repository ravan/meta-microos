SUMMARY = "Haskell X11-xft profiling library"
DESCRIPTION = "This package provides the Haskell X11-xft profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-X11-xft-prof-0.3.4-2.21.aarch64.rpm"
RPM_HASH = "df272a918c8f4dbbc677e7cc67a4e22818524e972799f5c94ac20bec0081b6ca75d057dd25c2df376b911b87f38707a189f6370eb6c27c0e25a9aa49e741b6a2"

RPROVIDES:${PN} += "ghc-X11-xft-prof \
ghc-prof-X11-xft-0.3.4-C3us4A75PM8AtwtgFqRfgr"

RDEPENDS:${PN} += "ghc-X11-xft-devel \
ghc-prof-X11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG"

inherit rpm
