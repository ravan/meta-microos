SUMMARY = "Perl interface for the MusicBrainz libdiscid library"
DESCRIPTION = "MusicBrainz::DiscID is a class to calculate a MusicBrainz DiscID from an \
audio CD in the drive."
LICENSE = "MIT"

PV = "0.06"

RPM_NAME = "perl-MusicBrainz-DiscID-0.06-2.7.aarch64.rpm"
RPM_HASH = "782d6470c9edfd6d9477cb45bd800eb6847086ec20f15645c24edb03a242451e5de1d5dee43814e193bff2d5a5661e6edd9ef2d0e5c61f62c10f50f197a116d3"

RPROVIDES:${PN} += "perl-MusicBrainz--DiscID \
perl-MusicBrainz-DiscID"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdiscid.so.0 \
perl--MODULE-COMPAT-5.44.0 \
perl-Carp \
perl-XSLoader"

inherit rpm
