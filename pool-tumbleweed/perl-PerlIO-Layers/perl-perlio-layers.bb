SUMMARY = "Querying your filehandle's capabilities"
DESCRIPTION = "Perl's filehandles are implemented as a stack of layers, with the \
bottom-most usually doing the actual IO and the higher ones doing \
buffering, encoding/decoding or transformations. PerlIO::Layers allows you \
to query the filehandle's properties concerning these layers."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.012"

RPM_NAME = "perl-PerlIO-Layers-0.012-1.36.aarch64.rpm"
RPM_HASH = "2745469723824569c819288d9e948d289cd354ee885a7711a53b6d17a887342cf3853737e4795008096f7a792ce8a1116ab6f6d5662993ee928ae7f4210855d8"

RPROVIDES:${PN} += "perl-PerlIO--Layers \
perl-PerlIO-Layers"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
