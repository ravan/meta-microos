SUMMARY = "Development files for dealii-openmpi5"
DESCRIPTION = "The dealii-openmpi5-devel package contains libraries and header files for \
developing applications that use dealii-openmpi5."
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.1"

RPM_NAME = "deal_II-openmpi5-devel-9.7.1-2.2.aarch64.rpm"
RPM_HASH = "f0183ef65aee83992033c0996535fd225f4a2ced950b6a1eda6855cd854d0c715c530554753d6100ad4a6400253dc95032a83ad70985e2ca4e8de9a74e4918b5"

RPROVIDES:${PN} += "deal-II-openmpi5-devel \
dealii-openmpi5-openmpi5-devel"

RDEPENDS:${PN} += "libdeal-II9-7-1-openmpi5"

inherit rpm
