SUMMARY = "Do use_ok() for all the MANIFESTed modules"
DESCRIPTION = "I'm sick of writing 00_load.t (or something like that) that'll do use_ok() \
for every module I write. I'm sicker of updating 00_load.t when I add \
another file to the distro. This module reads MANIFEST to find modules to \
be tested and does use_ok() for each of them. Now all you have to do is \
update MANIFEST. You don't have to modify the test any more (hopefully)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.170.0"

RPM_NAME = "perl-Test-UseAllModules-0.170.0-1.7.noarch.rpm"
RPM_HASH = "0c486647e5c58b20625e2525d7a9c7eadcd8ba236ff81bdf986ea90c7e710e5a675e749f9b393ded32bb712214aa96d3577791b3e9ab470b41198bf06b9e15ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--UseAllModules \
perl-Test-UseAllModules"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
