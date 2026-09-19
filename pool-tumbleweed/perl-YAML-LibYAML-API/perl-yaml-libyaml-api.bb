SUMMARY = "Wrapper around the C libyaml library"
DESCRIPTION = "This module provides a thin wrapper around the C libyaml API. \
 \
Currently it provides functions for parsing and emitting events. \
 \
libyaml also provides a loader/dumper API to load/dump YAML into a list of \
nodes. There's no wrapper for these functions yet. \
 \
This is just one of the first releases. The function names will eventually \
be changed. \
 \
The sources of 'libyaml-dev' are included in this distribution. You can \
build this module with the system libyaml instead, if you remove the \
libyaml sources and call 'Makefile.PL' with 'WITH_SYSTEM_LIBYAML=1'."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "perl-YAML-LibYAML-API-0.14.0-1.16.aarch64.rpm"
RPM_HASH = "4e16425c3490d156cf98f8976feaf8e56de70f0a268eabf1c41bd9cca07148ebe19c50018ee390e809ca31e45c73b54f77706fd7fdf8dbd062ceec64df368d11"

RPROVIDES:${PN} += "perl-YAML--LibYAML--API \
perl-YAML--LibYAML--API--XS \
perl-YAML-LibYAML-API"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-YAML--PP--Common"

inherit rpm
