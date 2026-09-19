SUMMARY = "Examples for the GNU Scientific Library"
DESCRIPTION = "This package contains examples for GSL"
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "gsl-examples-2.8-5.3.noarch.rpm"
RPM_HASH = "e40bbdf761f0940a854e8f6f74e41f246cd730488239bd35ced501f24a6f2fd78810d373cbd0382bf90702684172ccd8b961f202eb5067f1de5343f2d7b08d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-examples"

RDEPENDS:${PN} += ""

inherit rpm
