SUMMARY = "Haskell xmobar library development files"
DESCRIPTION = "This package provides the Haskell xmobar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.51.1"

RPM_NAME = "ghc-xmobar-devel-0.51.1-1.2.aarch64.rpm"
RPM_HASH = "4fc516272c1384d3ef5784bf73be04f540179f06c39623a753274cf759f0605b0a07097dc0008022ee2b221fbdc843994840ec60b35e6f2d0fcdf0e6d6230378"

RPROVIDES:${PN} += "ghc-devel-xmobar-0.51.1-Kxywu87r3W8KkooskAPEsu \
ghc-xmobar-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-X11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk \
ghc-devel-X11-xft-0.3.4-C3us4A75PM8AtwtgFqRfgr \
ghc-devel-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-devel-alsa-core-0.5.0.1-5pqfH6YvvEZ2vsBkGGr8JL \
ghc-devel-alsa-mixer-0.3.0.1-ByTU73KIfiF2vSD5rVSjfR \
ghc-devel-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-cairo-0.13.12.0-4t6EsC3Gqxb9Xow3SHIyd2 \
ghc-devel-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-devel-colour-2.3.7-LuxtbazHK7IK55ldBice4c \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-dbus-1.4.3-AK2RsEkhlPQ2FoxHH6Vf1Q \
ghc-devel-directory-1.3.10.1-b1d7 \
ghc-devel-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-hinotify-0.4.2-4RRzWLCNgXK8AEnEbLT8bd \
ghc-devel-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-devel-http-conduit-2.3.9.1-9k5MS2FS3s84zcOD2n4tN7 \
ghc-devel-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-devel-libmpd-0.10.0.1-Bmz7H1YtWod2b1GpfQlz83 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-netlink-1.1.1.0-CXOPJRLMZM2H8eJ1F7yaYv \
ghc-devel-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5 \
ghc-devel-pango-0.13.12.0-EYXFDNPBrZO4dDymUfkqjN \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-parsec-numbers-0.1.0-AMPF59BsE5W4SuUj5AhufY \
ghc-devel-process-1.6.26.1-905d \
ghc-devel-regex-compat-0.95.2.2-BPr9re8H6vl1LOIxX40pHj \
ghc-devel-stm-2.5.3.1-6d74 \
ghc-devel-time-1.14-a7dc \
ghc-devel-timezone-olson-0.2.1-LErbWe3Sa3TnblddNHkIO \
ghc-devel-timezone-series-0.1.13-B1H9AY16C4DSLWHEx9hhA \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unix-2.8.8.0-178a \
ghc-devel-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-xmobar \
libXrandr-devel \
libXrender-devel"

inherit rpm
