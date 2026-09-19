SUMMARY = "Development files for dino"
DESCRIPTION = "Contains libraries and header files for developing plugins for dino."
LICENSE = "GPL-3.0-only"

PV = "0.5.1"

RPM_NAME = "dino-devel-0.5.1-1.4.aarch64.rpm"
RPM_HASH = "110debd209da74485f01bcab0a230a283ccd8622198402b18573a775dc115534811c2da3ba50d33bdd2c6486391e8054ca65fcc6945f9c02b0ab5d04ac374306"

RPROVIDES:${PN} += "dino-devel"

RDEPENDS:${PN} += "dino"

inherit rpm
