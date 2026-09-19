SUMMARY = "Simple sprintf-like dialect"
DESCRIPTION = "String::Errf provides 'errf', a simple string formatter that works \
something like 'sprintf'. It is implemented using String::Formatter and \
Sub::Exporter. Their documentation may be useful in understanding or \
extending String::Errf. The 'errf' subroutine is only available when \
imported. Calling String::Errf::errf will not do what you want."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.009"

RPM_NAME = "perl-String-Errf-0.009-1.18.noarch.rpm"
RPM_HASH = "e5a37b4a5dc5356f55c8593ebf4a4d0af60c4716d7b576c25520a2bcdeaf4039f5b321c53769500f818b0b197c7c4ddc82bef174796350c94aeb74602d4c612b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Errf \
perl-String-Errf"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Params--Util \
perl-String--Formatter \
perl-Sub--Exporter \
perl-Time--Piece \
perl-parent"

inherit rpm
