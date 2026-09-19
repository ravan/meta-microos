SUMMARY = "Development files for Clipper2"
DESCRIPTION = "The Clipper2 library performs intersection, union, difference and XOR boolean \
operations on both simple and complex polygons. It also performs polygon \
offsetting. This is a major update of my original Clipper library that was \
written over 10 years ago. That library I'm now calling Clipper1, and while it \
still works very well, Clipper2 is better in just about every way."
LICENSE = "BSL-1.0"

PV = "2.0.1"

RPM_NAME = "Clipper2-devel-2.0.1-1.4.aarch64.rpm"
RPM_HASH = "a450cb8a78510c008857ef15fbf6c97a2a4a2165db31bc84e2a0ae1a27847ce4671cae49778944e38451bf2a1dd868bbe8a70c1a27e404402c110ba1c7aa5209"

RPROVIDES:${PN} += "Clipper2-devel \
cmake-Clipper2 \
pkgconfig-Clipper2 \
pkgconfig-Clipper2Z"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libClipper2-2 \
libClipper2Z2"

inherit rpm
