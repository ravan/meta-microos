SUMMARY = "Binary serialization module for Perl (encoder part)"
DESCRIPTION = "This library implements an efficient, compact-output, and feature-rich \
serializer using a binary protocol called _Sereal_. Its sister module \
Sereal::Decoder implements a decoder for this format. The two are released \
separately to allow for independent and safer upgrading. If you care \
greatly about performance, consider reading the Sereal::Performance \
documentation after finishing this document. \
 \
The Sereal protocol version emitted by this encoder implementation is \
currently protocol version 5 by default. \
 \
The protocol specification and many other bits of documentation can be \
found in the github repository. Right now, the specification is at \
https://github.com/Sereal/Sereal/blob/master/sereal_spec.pod, there is a \
discussion of the design objectives in \
https://github.com/Sereal/Sereal/blob/master/README.pod, and the output of \
our benchmarks can be seen at \
https://github.com/Sereal/Sereal/wiki/Sereal-Comparison-Graphs. For more \
information on getting the best performance out of Sereal, have a look at \
the 'PERFORMANCE' section below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.10.0"

RPM_NAME = "perl-Sereal-Encoder-5.10.0-1.1.aarch64.rpm"
RPM_HASH = "cf974ddb8b6d01003153d21fb9776f09da42d3c6cbf274dad98c72f2bab3e8fcfdd95ed4e3ebb6af95e59155be93a18216ed1a7e63ec57805e4a1170d985d0cb"

RPROVIDES:${PN} += "perl-Sereal--Encoder \
perl-Sereal--Encoder--Constants \
perl-Sereal-Encoder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Sereal--Decoder"

inherit rpm
