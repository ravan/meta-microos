SUMMARY = "Future-returning IO methods"
DESCRIPTION = "This package provides a few basic methods that behave similarly to the \
same-named core perl functions relating to IO operations, but yield their \
results asynchronously via Future instances. \
 \
This is provided primarily as a decoupling mechanism, to allow modules to \
be written that perform IO in an asynchronous manner to depend directly on \
this, while allowing asynchronous event systems to provide an \
implementation of these operations."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.170.0"

RPM_NAME = "perl-Future-IO-0.170.0-1.6.noarch.rpm"
RPM_HASH = "5c75bafb48bb3049e8b2a0cd61324b85885b7f4f00159147d80ff44235aacdca52a044f4de7a017d43c4517d84c245305aab0fa605ae4ff8914159f91fba3d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Future--IO \
perl-Future--IO--ImplBase \
perl-Future--IO--System \
perl-Future-IO"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Future \
perl-Struct--Dumb"

inherit rpm
