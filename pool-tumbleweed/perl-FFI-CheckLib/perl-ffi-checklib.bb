SUMMARY = "Check that a library is available for FFI"
DESCRIPTION = "This module checks whether a particular dynamic library is available for \
FFI to use. It is modeled heavily on Devel::CheckLib, but will find dynamic \
libraries even when development packages are not installed. It also \
provides a find_lib function that will return the full path to the found \
dynamic library, which can be feed directly into FFI::Platypus or another \
FFI system."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.31"

RPM_NAME = "perl-FFI-CheckLib-0.31-1.18.noarch.rpm"
RPM_HASH = "e3b00d61dd139d8d87402952008af57e287d9516be04b3b8e25efc7c01df243eef4595816f158ef5b22e4271072b53322a2048154cc4fe5b43e2c7b2639a96d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-FFI--CheckLib \
perl-FFI-CheckLib"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Which \
perl-List--Util"

inherit rpm
