SUMMARY = "Details of the floating point data type"
DESCRIPTION = "This module is about the native floating point numerical data type. A \
floating point number is one of the types of datum that can appear in the \
numeric part of a Perl scalar. This module supplies constants describing \
the native floating point type, classification functions, and functions to \
manipulate floating point values at a low level."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15.0"

RPM_NAME = "perl-Data-Float-0.15.0-1.7.noarch.rpm"
RPM_HASH = "2474393361a4476532d85dc291d3d45e58908845f8269b0c3f0f261c782f063e8466bd07602629fd8a51ebe491bcc24a3483040d588c1600460f4bcdf025585a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Float \
perl-Data-Float"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
