SUMMARY = "Haskell xmobar profiling library"
DESCRIPTION = "This package provides the Haskell xmobar profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.51.1"

RPM_NAME = "ghc-xmobar-prof-0.51.1-1.2.aarch64.rpm"
RPM_HASH = "327c7bad1491ccd2e157c8ec3b0a903ec2ebabecda38ddfdf538f8bb00b07fa8fb3e127c4e47151ba2bf9e5a97bb7177449bf1eea28570548eea24ed6bca6081"

RPROVIDES:${PN} += "ghc-prof-xmobar-0.51.1-Kxywu87r3W8KkooskAPEsu \
ghc-xmobar-prof"

RDEPENDS:${PN} += "ghc-prof-X11-1.10.3-1WMJghU3kQXBmOfIIGE3Rk \
ghc-prof-X11-xft-0.3.4-C3us4A75PM8AtwtgFqRfgr \
ghc-prof-aeson-2.2.5.0-3Moj34uePe8JCj0xjS5ggN \
ghc-prof-alsa-core-0.5.0.1-5pqfH6YvvEZ2vsBkGGr8JL \
ghc-prof-alsa-mixer-0.3.0.1-ByTU73KIfiF2vSD5rVSjfR \
ghc-prof-async-2.2.6-4fW0sXrepSt4QxgAnnLVB6 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cairo-0.13.12.0-4t6EsC3Gqxb9Xow3SHIyd2 \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww \
ghc-prof-colour-2.3.7-LuxtbazHK7IK55ldBice4c \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-dbus-1.4.3-AK2RsEkhlPQ2FoxHH6Vf1Q \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-extra-1.8.1-J47FlDu75Mb8OlFkJuPlkW \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-hinotify-0.4.2-4RRzWLCNgXK8AEnEbLT8bd \
ghc-prof-http-client-tls-0.4.0-D4cx6zdDU3O6iLaLdAAVnV \
ghc-prof-http-conduit-2.3.9.1-9k5MS2FS3s84zcOD2n4tN7 \
ghc-prof-http-types-0.12.5-FL2i1xGcqPq49wgWtgpOPM \
ghc-prof-libmpd-0.10.0.1-Bmz7H1YtWod2b1GpfQlz83 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-netlink-1.1.1.0-CXOPJRLMZM2H8eJ1F7yaYv \
ghc-prof-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5 \
ghc-prof-pango-0.13.12.0-EYXFDNPBrZO4dDymUfkqjN \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-parsec-numbers-0.1.0-AMPF59BsE5W4SuUj5AhufY \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-regex-compat-0.95.2.2-BPr9re8H6vl1LOIxX40pHj \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-time-1.14-a7dc \
ghc-prof-timezone-olson-0.2.1-LErbWe3Sa3TnblddNHkIO \
ghc-prof-timezone-series-0.1.13-B1H9AY16C4DSLWHEx9hhA \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unix-2.8.8.0-178a \
ghc-prof-utf8-string-1.0.2-FCJm07Id8m53KWoTjjdHEG \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-xmobar-devel"

inherit rpm
