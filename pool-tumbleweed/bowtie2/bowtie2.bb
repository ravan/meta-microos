SUMMARY = "Fast and memory-efficient short read aligner"
DESCRIPTION = "Bowtie 2 is an ultrafast and memory-efficient tool for aligning sequencing \
reads to long reference sequences. It is particularly good at aligning \
reads of about 50 up to 100s or 1,000s of characters, and particularly good \
at aligning to relatively long (e.g. mammalian) genomes. Bowtie 2 indexes \
the genome with an FM Index to keep its memory footprint small: for the \
human genome, its memory footprint is typically around 3.2 GB. Bowtie 2 \
supports gapped, local, and paired-end alignment modes."
LICENSE = "GPL-3.0-only"

PV = "2.5.4"

RPM_NAME = "bowtie2-2.5.4-2.7.aarch64.rpm"
RPM_HASH = "8ec31e363ae2dacddc60cdc5b72e2b5c18ffee29e8121d22c4f4b3ae3d81efd155a43a47a7d06862d965a4b27d96bd5125f21d0dd8e109ae3cecf4bcc25432c8"

RPROVIDES:${PN} += "bowtie2"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
