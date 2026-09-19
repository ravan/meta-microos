SUMMARY = "The Units library from CLHEP"
DESCRIPTION = "This package provides the header-only Units library from CLHEP"
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-Units-devel-2.4.7.2-1.4.noarch.rpm"
RPM_HASH = "c6f2af79afdd9ae05d16c8a4e223512d08199a950836f1d36f05426e18a1b6873eed3938202bf551586b5a5970f27baa1fa3460a831dfd366e1329bd1db98b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clhep-Units-devel"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
