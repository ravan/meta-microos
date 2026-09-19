SUMMARY = "Haskell xmonad-contrib profiling library"
DESCRIPTION = "This package provides the Haskell xmonad-contrib profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.18.2"

RPM_NAME = "ghc-xmonad-contrib-prof-0.18.2-1.3.aarch64.rpm"
RPM_HASH = "911c8fe94b2a623f2e6a4ae51762cdac30159eea24beffdf9c0cfa84ae0ad404044c8658693b2ee6e6d47a6b67669b2210d24bc09c3c6114cdf70254c9ebae42"

RPROVIDES:${PN} += "ghc-prof-xmonad-contrib-0.18.2-7mXB0q6IEmXBaWH27GMzuc \
ghc-xmonad-contrib-prof"

RDEPENDS:${PN} += "ghc-prof-X11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk \
ghc-prof-X11-xft-0.3.4-C3us4A75PM8AtwtgFqRfgr \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-time-1.14-a7dc \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-prof-xmonad-0.18.1-92DX9BCe4RIB8NiPfjJWdp \
ghc-xmonad-contrib-devel"

inherit rpm
