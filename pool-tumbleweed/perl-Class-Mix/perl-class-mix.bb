SUMMARY = "Dynamic class mixing"
DESCRIPTION = "The 'mix_class' function provided by this module dynamically generates \
`anonymous' classes with specified inheritance."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.6.0"

RPM_NAME = "perl-Class-Mix-0.6.0-1.7.noarch.rpm"
RPM_HASH = "378489748bc2ebfdebd385bd8327d054187b7e9d2a016e41ce7ace5d63af57acfae48471263a43f4314734fce537e50bfce39a0b0d9815afe51393d07ab25b3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Mix \
perl-Class-Mix"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Params--Classify \
perl-parent"

inherit rpm
