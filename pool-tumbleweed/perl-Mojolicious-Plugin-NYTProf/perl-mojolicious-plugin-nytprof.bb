SUMMARY = "Auto handling of Devel::NYTProf in your Mojolicious app"
DESCRIPTION = "This plugin enables Mojolicious to automatically generate Devel::NYTProf \
profiles and routes for your app, it has been inspired by \
Dancer::Plugin::NYTProf"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.23"

RPM_NAME = "perl-Mojolicious-Plugin-NYTProf-0.23-1.29.noarch.rpm"
RPM_HASH = "14f33744a3ab5fc253878aa8295c5eec1405ea1f0e34e9e7ad5f85833bd48dffbe52325291aa89fbefebf01a41045e6c0093672dd15b20c9ab4347e29739474d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--NYTProf \
perl-Mojolicious-Plugin-NYTProf"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--NYTProf \
perl-File--Spec--Functions \
perl-File--Temp \
perl-File--Which \
perl-Mojolicious \
perl-Time--HiRes"

inherit rpm
