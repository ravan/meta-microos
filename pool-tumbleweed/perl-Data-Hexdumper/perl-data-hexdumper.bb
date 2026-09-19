SUMMARY = "Make binary data human-readable"
DESCRIPTION = "'Data::Hexdumper' provides a simple way to format arbitrary binary data \
into a nice human-readable format, somewhat similar to the Unix 'hexdump' \
utility. \
 \
It gives the programmer a considerable degree of flexibility in how the \
data is formatted, with sensible defaults. It is envisaged that it will \
primarily be of use for those wrestling alligators in the swamp of binary \
file formats, which is why it was written in the first place."
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "3.0.100"

RPM_NAME = "perl-Data-Hexdumper-3.0.100-1.7.noarch.rpm"
RPM_HASH = "d62a5a0d69fb9f38f86eb82b2a96eb7a9e25a57a20dea833495cfdadf601f6e40508155d0fda255768e4ced13efc3e8055fb733c6024b86a3bd5e257cde93ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Hexdumper \
perl-Data-Hexdumper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Test--More"

inherit rpm
