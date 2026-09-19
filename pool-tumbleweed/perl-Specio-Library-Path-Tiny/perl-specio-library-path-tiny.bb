SUMMARY = "Path::Tiny types and coercions for Specio"
DESCRIPTION = "This library provides a set of Path::Tiny types and coercions for Specio. \
These types can be used with Moose, Moo, Params::ValidationCompiler, and \
other modules."
LICENSE = "Apache-2.0"

PV = "0.50.0"

RPM_NAME = "perl-Specio-Library-Path-Tiny-0.50.0-1.7.noarch.rpm"
RPM_HASH = "716e18f8fc08ffbbf2b69ad88d25f7ff793534c37e13366fe44457e3eaa10c09a968ddd07946a9171d36083d95aabbc6482db6098afaa6ced5ddb65490d5791a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Specio--Library--Path--Tiny \
perl-Specio-Library-Path-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Path--Tiny \
perl-Specio \
perl-Specio--Declare \
perl-Specio--Exporter \
perl-Specio--Library--Builtins \
perl-Specio--PartialDump \
perl-parent"

inherit rpm
