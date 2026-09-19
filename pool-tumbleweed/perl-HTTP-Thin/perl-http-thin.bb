SUMMARY = "Thin Wrapper around HTTP::Tiny to play nice with HTTP::Message"
DESCRIPTION = "WARNING: This module is untested beyond the very basics. The implementation \
is simple enough that it shouldn't do evil things but, yeah it's still not \
approved for use by small children. \
 \
'HTTP::Thin' is a thin wrapper around HTTP::Tiny adding the ability to pass \
in HTTP::Request objects and get back HTTP::Response objects. The \
maintainers of HTTP::Tiny, justifiably, don't want to have to maintain \
compatibility but many other projects already consume the HTTP::Message \
objects. This is just glue code doing what it does best."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.6.0"

RPM_NAME = "perl-HTTP-Thin-0.6.0-1.7.noarch.rpm"
RPM_HASH = "0c2f9d080d2a3878a141bfd3c3e3b39a10fb3169901f87e84b3f5afe26e19c00e0e919d309ac6801ff8f9d47ada493f09a59f3797c7394e3b68154c065584975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Thin \
perl-HTTP-Thin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Method--Modifiers \
perl-HTTP--Response \
perl-HTTP--Tiny \
perl-Hash--MultiValue \
perl-Safe--Isa \
perl-parent"

inherit rpm
