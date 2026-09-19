SUMMARY = "Mono bindings for AT-SPI"
DESCRIPTION = "C-Sharp/Mono bindings for Assistive Technology Service Provider Interface"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "at-spi-sharp-1.1.1-3.5.noarch.rpm"
RPM_HASH = "1221fa43455a04de6bdbd84561bfd5ba3e8447a60bc9043622f249fe6af7598d586170e52e2aa70a3c085acb93a4350849ff7bb66cc8da02fbbb5e932447e9b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "at-spi-sharp \
mono-at-spi-sharp"

RDEPENDS:${PN} += "mono-Mono.Posix \
mono-System \
mono-System.Core \
mono-System.Xml \
mono-core \
mono-mscorlib"

inherit rpm
