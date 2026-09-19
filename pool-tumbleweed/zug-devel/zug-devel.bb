SUMMARY = "Transducers for C++"
DESCRIPTION = "zug is a C++ library providing transducers. Transducers are composable \
sequential transformations independent of the source. They can be used to \
express algorithms over pull-based sequences (iterators, files) but also push \
based sequences (signals, events, asynchronous streams) in a generic way."
LICENSE = "BSL-1.0"

PV = "0.1.2"

RPM_NAME = "zug-devel-0.1.2-2.1.aarch64.rpm"
RPM_HASH = "3641bdef00c42f22a43cc26b3d2112a4226c292c8815f2a1912192e46a2b6ae265f08c05d468e5185a234dc404d6f063e4c8046c047599947aee495c3d4efabf"

RPROVIDES:${PN} += "cmake-Zug \
zug-devel"

RDEPENDS:${PN} += ""

inherit rpm
