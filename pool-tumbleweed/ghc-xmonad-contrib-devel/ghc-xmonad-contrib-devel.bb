SUMMARY = "Haskell xmonad-contrib library development files"
DESCRIPTION = "This package provides the Haskell xmonad-contrib library development files."
LICENSE = "BSD-3-Clause"

PV = "0.18.2"

RPM_NAME = "ghc-xmonad-contrib-devel-0.18.2-1.3.aarch64.rpm"
RPM_HASH = "a3f2641a089e8449fb402e4600f8a91387ebfe6b5da00aa879bcf90050ff4fbf06c70926fee5d5835255552445808b90188da20cb98cf6ba2427da104e58b2b6"

RPROVIDES:${PN} += "ghc-devel-xmonad-contrib-0.18.2-7mXB0q6IEmXBaWH27GMzuc \
ghc-xmonad-contrib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-X11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk \
ghc-devel-X11-xft-0.3.4-C3us4A75PM8AtwtgFqRfgr \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-time-1.14-a7dc \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-devel-xmonad-0.18.1-92DX9BCe4RIB8NiPfjJWdp \
ghc-xmonad-contrib"

inherit rpm
