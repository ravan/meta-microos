SUMMARY = "Fast and memory-efficient short read aligner"
DESCRIPTION = "Bowtie is an ultrafast, memory-efficient short read aligner. It aligns short \
DNA sequences (reads) to the human genome at a rate of over 25 million 35-bp \
reads per hour. Bowtie indexes the genome with a Burrows-Wheeler index to keep \
its memory footprint small: typically about 2.2 GB for the human genome \
(2.9 GB for paired-end)."
LICENSE = "Artistic-1.0"

PV = "1.3.1"

RPM_NAME = "bowtie-1.3.1-1.15.aarch64.rpm"
RPM_HASH = "8aed72d3cc1da686b93d4b887729d5771b69733b0d99c9ab28b3a7043b7d128ae38620c6f0c61a41721a5aa3f3b1d9b0a215c331711865c086d1a4a4aa8c86fa"

RPROVIDES:${PN} += "bowtie"

RDEPENDS:${PN} += "/usr/bin/python3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
