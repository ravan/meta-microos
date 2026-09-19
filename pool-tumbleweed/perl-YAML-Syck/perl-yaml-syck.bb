SUMMARY = "Perl YAML loader and dumper"
DESCRIPTION = "This module provides a Perl interface to the *libsyck* data serialization \
library. It exports the 'Dump' and 'Load' functions for converting Perl \
data structures to YAML strings, and the other way around. \
 \
*NOTE*: If you are working with other language's YAML/Syck bindings (such \
as Ruby), please set '$YAML::Syck::ImplicitTyping' to '1' before calling \
the 'Load'/'Dump' functions. The default setting is for preserving \
backward-compatibility with 'YAML.pm'."
LICENSE = "MIT"

PV = "1.470.0"

RPM_NAME = "perl-YAML-Syck-1.470.0-1.3.aarch64.rpm"
RPM_HASH = "d1eb2f947a2d6e9256eea1e3fab1ff9afe283db1efb92ffd00b2bcc7befca3298c70d978f97a2e276004ab58c94debca55067995ede66372d8872b9bb6683ac6"

RPROVIDES:${PN} += "perl-JSON--Syck \
perl-YAML--Dumper--Syck \
perl-YAML--Loader--Syck \
perl-YAML--Syck \
perl-YAML-Syck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
