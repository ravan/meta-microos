SUMMARY = "Simplistic Interface to Pkg-Config"
DESCRIPTION = "The pkg-config program retrieves information about installed libraries, \
usually for the purposes of compiling against and linking to them. \
 \
ExtUtils::PkgConfig is a very simplistic interface to this utility, \
intended for use in the Makefile.PL of perl extensions which bind libraries \
that pkg-config knows. It is really just boilerplate code that you would've \
written yourself."
LICENSE = "LGPL-2.1+"

PV = "1.160000"

RPM_NAME = "perl-ExtUtils-PkgConfig-1.160000-1.39.noarch.rpm"
RPM_HASH = "66219366189a9b3edc839ecd0f4044469c7118f46dcbf2859853d4f9c2d00970024abc878c0a621f2242f71256c12b71e5d77a1186b3e13aeef601e482bcebcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--PkgConfig \
perl-ExtUtils-PkgConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
pkgconfig"

inherit rpm
