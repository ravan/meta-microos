SUMMARY = "A library to Manipulate RDF Files for LADSPA Plug-Ins"
DESCRIPTION = "This is a library to make it easy to manipulate RDF files describing \
LADSPA plug-ins. It can also be used for general RDF manipulation. \
 \
It can read RDF, XLM, and N3 files and export N3 files. Ot also has a \
light taxonomic inference capability."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "liblrdf2-0.6.1-1.22.aarch64.rpm"
RPM_HASH = "edcd48db3c10dec96bb3ccbd7a1a853cb38e23b8c8e2492c850572cd71c22536dae88744453af6b36760a09acc0c6dc34ee415ed492ca2868bd9ebd7a72585da"

RPROVIDES:${PN} += "liblrdf \
liblrdf.so.2 \
liblrdf2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libraptor2.so.0"

inherit rpm
