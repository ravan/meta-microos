SUMMARY = "DSSSL Engine for SGML Documents"
DESCRIPTION = "OpenJade, the follow-up to Jade by James Clark, is an implementation of \
the ISO/IEC 10179:1996 standard DSSSL (Document Style, Semantics, and \
Specification Language); pronounce it 'dissl'--it rhymes with whistle. \
 \
It has back-ends for SGML, RTF, MIF, TeX, and HTML. \
 \
The parser, 'nsgmls,' and helper tools like 'sgmlnorm,' 'spam,' \
'spent,' and 'sx' are now included in the separate 'opensp' package."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "openjade-1.3.2-375.3.aarch64.rpm"
RPM_HASH = "dbc4ad1e0af58cd24442fc3fd7f3b6f93445d11c4594ac6dbb7af20e6377cc67011817f85e60156b1483ed4960795f8e2d6b3b69e8f92841c56b46620d08c48b"

RPROVIDES:${PN} += "jade \
libogrove.so.0 \
libospgrove.so.0 \
libostyle.so.0 \
openjade"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libosp.so.5 \
libstdc++.so.6 \
opensp \
sgml-skel"

inherit rpm
